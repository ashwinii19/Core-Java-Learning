<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
<style>
        body {
            background-color: #e9f0f7;
            font-family: Arial, sans-serif;
        }
        .dashboard {
            max-width: 700px;
            margin: 20px auto;
            padding: 15px;
        }
        .student {
            border-bottom: 1px solid #ccc;
            padding: 15px 0;
        }
        .warning {
            color: red;
            font-weight: bold;
        }
    </style>
</head>
<body>

	<h2>Error</h2>
	 <p>
        <c:choose>
            <c:when test="${not empty error}">
                ${error}
            </c:when>
            <c:otherwise>
                An unknown error occurred.
            </c:otherwise>
        </c:choose>
    </p>

    <p>
        <a href="${pageContext.request.contextPath}/">Back to Home</a><br/>
        <a href="${pageContext.request.contextPath}/login.jsp">Try Login Again</a>
    </p>
</body>
</html>