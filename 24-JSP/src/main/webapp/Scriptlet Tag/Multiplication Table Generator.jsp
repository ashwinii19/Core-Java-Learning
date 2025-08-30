<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication</title>
</head>
<body>

	<h2>Multiplication Table</h2>

	<%
	int number = 7; 
	for (int i = 1; i <= 10; i++) {
		int result = number * i;
		out.println(number + " x " + i + " = " + result + "<br>");
	}
	%>

</body>
</html>