<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math Calculator</title>
</head>
<body>

	<h2>Math Calculator</h2>

	<%
	int a = 15;
	int b = 4;
	%>

	<p>Sum = <%=a + b%></p>
	<p>Difference = <%=a - b%></p>
	<p>Product = <%=a * b%></p>
	<p>Division = <%=(double) a / b%></p>
</body>
</html>