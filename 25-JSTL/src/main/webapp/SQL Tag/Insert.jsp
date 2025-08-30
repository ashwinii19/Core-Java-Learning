<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
</head>
<body>

	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/company_db"
	user="root" password="admin#123"/>
	
	<sql:update dataSource="${db}">
	INSERT into employees (name, department, email, salary) VALUES ('Durgesh', 'IT', 'durgesh@gmail.com', 30000);
	</sql:update>
	
	<h3>Employee record inserted successfully</h3>
</body>
</html>