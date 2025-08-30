<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Attendance</title>
</head>
<body>

	<%
	String student = "Ashwini";
	int totalClasses = 40;
	int attended = 35;
	double percentage = (attended * 100.0) / totalClasses;
	%>
	<h3> Student: <%=student%></h3>
	<p>Attendance: <%=percentage%> %</p>
</body>
</html>