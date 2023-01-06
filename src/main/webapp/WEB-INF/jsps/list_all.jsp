<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>all leads</title>
</head>
<body>
	<h3>List all leads....</h3>
	<table border='2'>
	  <tr>
	  <th>Email</th>
	  <th>firstName</th>
	  <th>LastName</th>
	  <th>Mobile</th>
	  <th>delete</th>
	  <TH>UPDATE </TH>
	  </tr>
	<c:forEach var="leads" items="${leads}">
	<tr>
		<td>${leads.email}</td>
		<td>${leads.firstName}</td>
		<td>${leads.lastName}</td>
		<td>${leads.mobile}</td>
		<td><a href="delete?id=${leads.id }">delete</a>
		<td><a href="update?id=${leads.id }">Update</a>
	</tr>
	
	</c:forEach>
	
	
	
	</table>

</body>
</html>