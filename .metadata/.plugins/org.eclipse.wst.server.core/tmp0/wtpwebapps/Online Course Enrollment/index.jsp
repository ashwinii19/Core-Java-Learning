<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Course</title>
<style>
        body {
            background-color: #e9f0f7;
            font-family: Arial, sans-serif;
        }
        .dashboard {
            max-width: 700px;
            margin: 20px auto;
            padding: 15px;
        }
        .student {
            border-bottom: 1px solid #ccc;
            padding: 15px 0;
        }
        .warning {
            color: red;
            font-weight: bold;
        }
    </style>

</head>
<body>

	<h3>Online Course Dashboard</h3>
	
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/online_course"
	user="root" password="admin#123"/>
	
	<sql:query var="result" dataSource="${db}">
		 SELECT s.id, s.name, s.email, s.join_date, s.fees_paid, c.course_list
        FROM students s
        JOIN courses c ON s.id = c.student_id
	</sql:query>
	
	<c:choose>
		<c:when test="${not empty result.rows}">
			<c:forEach var="student" items="${result.rows }">
				 <div class="student">
					<p><strong>Student: </strong> ${student.name}</p>
					<p><strong>Email: </strong> ${student.email}</p>
					<p><strong>Institutional Email </strong>
						<c:out value="${fn:contains(student.email, 'edu') }"></c:out>
					</p>
					
					<p><strong>Join Date: </strong>
						<fmt:parseDate var="joinDate" value="${student.join_date }" pattern="yyyy-MM-dd"></fmt:parseDate>
						<fmt:formatDate value="${joinDate}" pattern="MMM d, yyyy"/>
					</p>
						
					<p><strong>Fees paid: </strong>	
						<fmt:setLocale value="en_INR" />
						<fmt:formatNumber value="${student.fees_paid}" type="currency"></fmt:formatNumber>
					</p>
					
					<c:if test="${student.fees_paid lt 1000}">
						<p class="warning">Warning: Fees not fully paid!</p>
					</c:if>
					
					<p><strong>Courses Enrolled:</strong></p>
                    <ul>
                        <c:forEach var="course" items="${fn:split(student.course_list, ',')}">
                            <li>${course}</li>
                        </c:forEach>
                    </ul>
                </div>
			</c:forEach>
    	</c:when>
    	 <c:otherwise>
            <p>No student records found.</p>
        </c:otherwise>
    </c:choose>
	

</body>
</html>