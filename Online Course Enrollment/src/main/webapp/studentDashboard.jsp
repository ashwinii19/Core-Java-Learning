<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Student Dashboard</title>
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

    <h2>Student Dashboard</h2>

    <c:if test="${not empty student}">
    	<div style="border:1px solid #ccc; margin:10px; padding:10px;">
	        <p><strong>Name:</strong> ${student.name}</p>
	        <p><strong>Email:</strong> ${student.email}</p>
	        <p><strong>Institutional Email:</strong> ${fn:contains(student.email, 'edu') ? 'Yes' : 'No'}</p>
	
	        <p><strong>Join Date:</strong> 
	            <fmt:formatDate value="${student.joinDate}" pattern="MMM d, yyyy"/>
	        </p>
	
	        <p><strong>Fees Paid:</strong> 
	            <fmt:setLocale value="en_US"/>
	            <fmt:formatNumber value="${student.feesPaid}" type="currency"/> 
	        </p>
	
	        <c:if test="${student.feesPaid lt 1000}">
	            <p style="color:red;">Fees not fully paid!</p>
	        </c:if>
	
	        <p><strong>Courses Enrolled:</strong></p>
	        <ul>
	            <c:forEach var="course" items="${fn:split(student.courseList, ',')}">
	                <li>${course}</li>
	            </c:forEach>
	        </ul>
		</div>
    </c:if>

    <c:if test="${empty student}">
        <p>${message}</p>
    </c:if>

	<p>
        <a href="login.jsp">Back to Home</a><br/>
    </p>
</body>
</html>