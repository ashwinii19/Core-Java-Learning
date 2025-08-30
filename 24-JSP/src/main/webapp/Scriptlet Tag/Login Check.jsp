<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Check</title>
</head>
<body>

	<%
	String username = "admin";
	String password = "12345";

	String inputUsername = "admin";
	String inputPassword = "123456";

	if (username.equals(inputUsername) && password.equals(inputPassword)) {
	%>
	
	<h2><%out.println("Welcome, " + username);%></h2>
	
	<%
	} else {
	%>
	
	<h2><%out.println("Invalid Credentials");%></h2>
	
	
	<%
	}
	%>

</body>
</html>