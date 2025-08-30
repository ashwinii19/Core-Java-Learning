<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<jsp:useBean id="student" class="com.model.Student" scope="session" />
<jsp:setProperty name="student" property="*" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
    <jsp:include page="header.jsp"/>

    <h3>Student Profile</h3>
    Name: <jsp:getProperty name="student" property="name"/><br>
    Roll No: <jsp:getProperty name="student" property="rollNo"/><br>
    Math: <jsp:getProperty name="student" property="math"/><br>
    Science: <jsp:getProperty name="student" property="science"/><br>
    English: <jsp:getProperty name="student" property="english"/><br><br>

    <jsp:forward page="result.jsp">
        <jsp:param name="math" value="<%= student.getMath() %>"/>
        <jsp:param name="science" value="<%= student.getScience() %>"/>
        <jsp:param name="english" value="<%= student.getEnglish() %>"/>
        <jsp:param name="name" value="<%= student.getName() %>"/>
        <jsp:param name="rollNo" value="<%= student.getRollNo() %>"/>
    </jsp:forward>

    <jsp:include page="footer.jsp"/>
</body>
</html>