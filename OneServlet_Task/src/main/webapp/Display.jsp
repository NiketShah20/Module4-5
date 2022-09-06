<%@page import="java.applet.Applet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr,td{
		border:1px solid black;
	}
</style>

</head>
<body>
<%@include file="Register.jsp" %>
<div style="margin-top:5%;">
<h1>Register Details</h1>
<table style="border: 1px solid black">
	<%
		String name=request.getParameter("user_name");
		String email=request.getParameter("user_email");
		String mobile_number=request.getParameter("user_phone");
		String hobby=request.getParameter("user_hobby");
		application.setAttribute("name", name);
		application.setAttribute("email", email);
		application.setAttribute("number", mobile_number);
		application.setAttribute("hobby",hobby); 
	%>
	<tr>
		<td>Name</td>
		<td>Email</td>
		<td>Hobby</td>
		<td>Phone_Number</td>
		<td>Update_details</td>
	</tr>
	<tr>
		<td><%= request.getParameter("user_name") %></td>
		<td><%= request.getParameter("user_email") %></td>
		<td><%= request.getParameter("user_phone") %></td>
		<td><%=request.getParameter("user_hobby")  %></td>
		
		<td><form action="input" method="post">
			<input type="submit"  name="submit" value="edit"/>
		</form></td>
	</tr>
</table>
</div>
</body>
</html>