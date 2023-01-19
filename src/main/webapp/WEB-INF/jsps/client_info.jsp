<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Information</title>
</head>
<body>
	<h2> Client Details</h2>
	First Name:${clientinfo.firstname}<br/>
	Last Name:${clientinfo.lastname}<br/>
	Email Id:${clientinfo.email}<br/>
	Mobile No:${clientinfo.mobile}<br/>
	Source:${clientinfo.source}<br/>
	
	<form action="composeEmail" method="post">
		<input type="hidden" name="email" value="${clientinfo.email}"/>
		<input type="submit" value="Email"/>
	</form>
	<form action="convertClient" method="post">
	<input type="hidden" name="id" value="${clientinfo.id}"/>
	<input type="submit" value="convert"/>
	
	
	</form>
			
			
		
		
	


</body>
</html>