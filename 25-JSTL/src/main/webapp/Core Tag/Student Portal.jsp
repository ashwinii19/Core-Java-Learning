<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Result</</title>
</head>
<body>
	<h2>Student Result</h2>
	<c:set var="marks" value="72" />
	<c:if test="${marks >= 40}">
	Status: Pass with ${marks} marks 
	</c:if>
	<c:if test="${marks < 40}">
	Status: Fail 
	</c:if>
</body>
</html>