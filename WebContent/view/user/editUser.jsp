<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User" method="post">
	<input type="hidden" name="id" value="<c:out value='${user.id}'/>">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" value="<c:out value='${user.name}'/>"></td>
			</tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="username" value="<c:out value='${user.username}'/>"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" value="<c:out value='${user.password}'/>"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>