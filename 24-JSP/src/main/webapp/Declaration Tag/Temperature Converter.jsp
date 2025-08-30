<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Temperature Converter</title>
</head>
<body>

	<%!public double celsiusToFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	public double fahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}%>

	<%
	double celsius = 30.0;
	double fahrenheit = 86.0;

	double convertedToFahrenheit = celsiusToFahrenheit(celsius);
	double convertedToCelsius = fahrenheitToCelsius(fahrenheit);
	%>

	<h2>Temperature Conversion Results</h2>
	<p>30°C in Fahrenheit is: <%= convertedToFahrenheit %>°F</p>
	<p>86°F in Celsius is: <%= convertedToCelsius %>°C</p>
</body>
</html>