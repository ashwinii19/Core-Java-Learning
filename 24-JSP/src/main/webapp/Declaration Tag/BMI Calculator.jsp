<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Calculator</title>
</head>
<body>

	<%!public double calculateBMI(double weightKg, double heightM) {
		return weightKg / (heightM * heightM);
	}%>
	<%
	double bmi = calculateBMI(70, 1.75);
	%>
	<h2>BMI Value: <%= bmi %></h2>
	<%
	if (bmi < 18.5)
		out.print("Underweight");
	else if (bmi < 24.9)
		out.print("Normal Weight");
	else
		out.print("Overweight");
	%>
</body>
</html>