<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ALL CLIENTS</title>
</head>
<body>
	<h2>List All CLIENTS...</h2>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Action</th>
		</tr>

		<c:forEach var="Client" items="${contacts}">
			<tr>
				<td><a href="clientinfo?id=${clientinfo.id}">${Client.firstname}</a></td>
				<td>${Client.lastname}</td>
				<td>${Client.email}</td>
				<td>${Client.mobile}</td>
				
				<td><a href="delete?id=${Client.id}">delete</a> 
					<a href="update?id=${Client.id}">update</a>
				</td>

			</tr>
		</c:forEach>

	</table>
</body>
</html>