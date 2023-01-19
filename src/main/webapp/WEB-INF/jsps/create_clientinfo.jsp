<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CREATE</title>
</head>
<body>
	<h2>New Client</h2>
	<form action="saveClient" method="post">
		<pre>
		      First Name<input type="text" name="firstname" /> 
			  Last Name<input type="text" name="lastname" />
	          Email<input type="email" name="email" />
		   	Mobile<input type="tel" name="mobile" />
		 Source: 
		 <select name="source">
			<option value="newspaper">newspaper</option>
			<option value="online">Online</option>
			<option value="webinar">Webinar</option>
			<option value="radio">Radio</option>
		</select>
		<input type="submit" value="save" />
		
		
		</pre>


	</form>



</body>
</html>