<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current Date & Time</title>
</head>
<body>

	<h2>Current Date:</h2>
	<p><%=new java.util.Date()%></p>

	<h2>Current Year:</h2>
	<p><%=java.time.Year.now()%></p>
</body>
</html>