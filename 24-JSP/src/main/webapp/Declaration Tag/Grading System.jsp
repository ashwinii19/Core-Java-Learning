<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grading System</title>
</head>
<body>

	<%!public String getGrade(int marks) {
		if (marks >= 90)
			return "A+";
		else if (marks >= 75)
			return "A";
		else if (marks >= 60)
			return "B";
		else
			return "C";
	}%>
	<%
	int marks = 82;
	String grade = getGrade(marks);
	%>
	<h2>Marks: <%= marks %></h2>
	<h2>Grade: <%= grade %></h2>
</body>
</html>