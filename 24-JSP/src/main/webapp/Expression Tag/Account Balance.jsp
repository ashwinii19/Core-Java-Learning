<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Banking</title>
</head>
<body>

	<%
	String customerName = "Ashwini";
	double balance = 15230.75;
	%>
	<h2>Welcome,<%=customerName%></h2>
	<p>Your Current Balance: RS <%=balance%></p>
</body>
</html>