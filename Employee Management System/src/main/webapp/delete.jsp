<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.techlabs.EMS.db.Services, com.techlabs.EMS.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employees</title>
  <style>
  body {
    background-color: #2c3e50; 
    color: #ecf0f1; 
    font-family: Arial, sans-serif;
  }
</style>
</head>
<body>
<%
    String idStr = request.getParameter("id");
    if (idStr != null) {
        int id = Integer.parseInt(idStr);
        Employee emp = new Employee(id, "", "", "", 0);
        Services.deleteEmployee(emp);
    }
    response.sendRedirect("view.jsp");
%>
</body>
</html>
