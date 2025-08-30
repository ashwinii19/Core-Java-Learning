<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Balance</title>
</head>
<body>

	<%
	double balance = 15000.75;
	if (balance > 10000) {
	%>
	
	<p>Status: Premium Customer</p>
	
	<%
	} else {
	%>
	
	<p>Status: Regular Customer</p>
	
	<%
	}
	%>
</body>
</html>