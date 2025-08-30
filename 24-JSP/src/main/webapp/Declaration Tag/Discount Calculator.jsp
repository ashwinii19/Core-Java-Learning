<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Discount Calculator</title>
</head>
<body>
	<%!// Declaration of method
	public double calculateDiscount(double price) {
		if (price > 5000)
			return price * 0.10;
		else
			return price * 0.05; 
	}%>
	<%
	double price = 6000;
	double discount = calculateDiscount(price);
	%>
	<h2>Price: <%=price%></h2>
	<h2>Discount: <%=discount%></h2>
	<h2>Final Amount: <%=(price - discount)%></h2>
</body>
</html>