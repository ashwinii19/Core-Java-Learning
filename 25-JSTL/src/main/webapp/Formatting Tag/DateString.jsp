<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Event Management System</title>
</head>
<body>

<fmt:parseDate value="2025-08-25" pattern="yyyy-MM-dd" var="eventDate" />

<p>Parsed Event Date:
    <fmt:formatDate value="${eventDate}" type="date" dateStyle="long" />
</p>

</body>
</html>