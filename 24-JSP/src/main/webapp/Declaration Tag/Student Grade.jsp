<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Grade</title>
</head>
<body>

	<%!
	public String getGrade(int marks) {
		if (marks >= 85)
			return "A";
		else if (marks >= 70)
			return "B";
		else if (marks >= 50)
			return "C";
		else
			return "Fail";
	}%>
	
	 <%
        int marks = 72;
    %>
    <h2>Grade: <%= getGrade(marks) %></h2>
</body>
</html>