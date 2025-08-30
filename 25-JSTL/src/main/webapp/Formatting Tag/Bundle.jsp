<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>International Store</title>
</head>
<body>

    <fmt:setLocale value="fr_FR" />

    <fmt:setBundle basename="messages" />

    <h2><fmt:message key="welcome" /></h2>
    <p><fmt:message key="checkout" /></p>
</body>
</html>