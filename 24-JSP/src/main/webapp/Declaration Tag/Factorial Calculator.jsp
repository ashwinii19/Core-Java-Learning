<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Calculator</title>
</head>
<body>

	<%!
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}%>
	
	 <h2>Factorial of 4 = <%= factorial(4) %></h2>
</body>
</html>