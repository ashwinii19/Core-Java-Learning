<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Marks Report</title>
</head>
<body>

	<%
	int marks = 70;
	String grade;
	if (marks >= 90)
		grade = "A+";
	else if (marks >= 75)
		grade = "A";
	else
		grade = "B";
	%>
	<h3>Marks: <%=marks%></h3>
	<h3>Grade: <%=grade%></h3>
</body>
</html>