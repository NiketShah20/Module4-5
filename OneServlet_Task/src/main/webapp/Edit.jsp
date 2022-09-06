<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr,td{
		border:2px solid black;
	}
</style>
</head>
<body>
	<h1>Update page</h1>
	<form action="input" method="post">
		Name:<br>
		<input type="text"  name="user_name" value="<%=application.getAttribute("name").toString()%>"><br>
		Email:<br>
		<input type="email" name="user_email" value=<%= application.getAttribute("email") %>><br>
		Phone_Number:<br>
		<input type="tel" name="user_phone" value=<%= application.getAttribute("number") %>><br>
		Hobby:<br>
		<input type="text" name="user_hobby" value="<%= application.getAttribute("hobby") %>"><br><br>
		<input type="submit" name="submit" value=update>
	</form>
</body>
</html>