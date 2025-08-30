<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ATM</title>
</head>
<body>

	<%
	int balance = 5000;
	int withdrawAmount = 1200;

	if (withdrawAmount <= balance) {
		balance -= withdrawAmount;
	%>
	<h2>Withdrawal Successful</h2>
	<%
	out.println("Remaining Balance: " + balance);
	%>
	<%
	} else {
	%>
	<h2>Insufficient Funds</h2>
	<%
	out.println("Available Balance: " + balance);
	%>
	<%
	}
	%>
</body>
</html>