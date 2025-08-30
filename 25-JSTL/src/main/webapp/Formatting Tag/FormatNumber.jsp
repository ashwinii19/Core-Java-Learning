<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exam result</title>
</head>
<body>

	<% 
		double score = 0.845;
		request.setAttribute("score", score);
	%>
	
	<h2>Exam Score</h2>
	<p>Percentage: <fmt:formatNumber value="${score}" type="percent" maxFractionDigits="1"></fmt:formatNumber>
</body>
</html>