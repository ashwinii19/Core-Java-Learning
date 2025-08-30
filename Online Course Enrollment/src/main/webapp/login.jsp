<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
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

	<h2>Login</h2>
	<form method="post" action="${pageContext.request.contextPath}/login">
	    Username: <input name="username"/> <br/>
	    Password: <input type="password" name="password"/> <br/>
	    <button type="submit">Login</button>
	</form>
	
</body>
</html>