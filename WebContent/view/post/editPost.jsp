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
	<form action="Post" method="post">
		<input type="hidden" name="id" value="<c:out value='${post.id}'/>">
		<table>
			<tr>
				<td>Title:</td>
				<td><input type="text" name="title"
					value="<c:out value='${post.title}'/>"></td>
			</tr>
			<tr>
				<td>Content:</td>
				<td><textarea name="content" rows="5" cols="30">${post.content}</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>