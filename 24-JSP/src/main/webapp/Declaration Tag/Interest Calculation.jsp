<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Interest Calculation</title>
</head>
<body>

	<%!public double calculateInterest(double principal, double rate, int years) {
		return (principal * rate * years) / 100;
	}%>
	<%
	double interest = calculateInterest(100000, 6.5, 2);
	%>
	<p>Interest Earned: <%= interest %></p>
</body>
</html>