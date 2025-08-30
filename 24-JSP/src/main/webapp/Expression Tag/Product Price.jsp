<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-commerce</title>
</head>
<body>

	<%
	double price = 50000;
	double discount = 0.1; 
	double finalPrice = price - (price * discount);
	%>
	<h3>Original Price: RS <%= price%></h3>
	<h3>Discounted Price: RS <%= finalPrice%></h3>
</body>
</html>