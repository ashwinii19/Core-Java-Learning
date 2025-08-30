<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>


	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/school_db"
	user="root" password="admin#123"/>
	
	<sql:query var="student" dataSource="${db}">
	SELECT id, name, age FROM students;
	</sql:query>
	
	<h2>Students Records</h2>
	<table border="1">
	<tr><th>ID</th><th>Name</th><th>Age</th></tr>
	<c:forEach var="row" items="${student.rows}">
	<tr>
	<td>${row.id}</td>
	<td>${row.name}</td>
	<td>${row.age}</td>
	</tr>
	
	</c:forEach>
	</table>
</body>
</html>