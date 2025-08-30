<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Age</title>
</head>
<body>

	<%
	String patient = "Ashwini Dagale";
	int birthYear = 2003;
	int currentYear = java.time.Year.now().getValue();
	int age = currentYear - birthYear;
	%>
	<h2>Patient: <%=patient%></h2>
	<p>Age: <%=age%> years</p>
</body>
</html>