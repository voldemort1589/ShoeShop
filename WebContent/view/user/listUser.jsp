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
	<a href = "<c:url value = "User?action=add"/>">Register</a>
	<a href = "<c:url value = "Login"/>">Login</a>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Username</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		<c:forEach var="user" items="${listUsers}">
			<tr>
				<td><c:out value="${user.id}"></c:out></td>
				<td><c:out value="${user.name}"></c:out></td>
				<td><c:out value="${user.username}"></c:out></td>
				<td><c:out value="${user.password}"></c:out></td>
				<td><a href="<c:url value="User?action=edit&id=${user.id}"/>">Edit</a>
					<a href="<c:url value="User?action=delete&id=${user.id}"/>">Remove</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>