<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Submit page</h1>
	<form action="input" method="post">
		Name:<br>
		<input type="text"  name="user_name"><br>
		Email:<br>
		<input type="email" name="user_email"><br>
		Phone_Number:<br>
		<input type="tel" name="user_phone"><br>
		Hobby:<br>
		<input type="text" name="user_hobby"><br><br>
		<input type="submit" name="submit" value="register">
	</form>
</body>
</html>