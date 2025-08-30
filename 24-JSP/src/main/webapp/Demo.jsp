<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>

	<%---Scriptlet tag --%>
	
	<%
	//Get the name parameter from the request
		String name = request.getParameter("name");
	%>
	
	<!-- Form to accept user name -->
	<form method="get" action="greet.jsp">
		Enter your name: <input type="text" name="name"/>
		<input type="submit" value="Submit"/>
	</form>
	
	<%
	if(name != null && !name.trim().isEmpty()){
	%>
	
	<h2>Hello, <%=name %>! Welcome to JSP</h2>
	
	<%
	}
	else{
		%>
	<h2>Hello, user! Welcome to JSP</h2>
	<% 
	}
	%>
	
</body>
</html>