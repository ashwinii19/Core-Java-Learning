<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tour Packages</title>
</head>
<body>

	<h2>Available Packages</h2>
	<c:set var="packages" value="Paris, Lodon, NewYork, Toyko"></c:set>
	<c:forTokens var="city" items="${packages }" delims=",">Destination: ${city}<br></c:forTokens>
</body>
</html>