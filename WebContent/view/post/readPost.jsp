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
	<table>
		<tr>
			<td>${post.title}</td>
		</tr>
		<tr>
			<td>${post.content}</td>
		</tr>
		<tr>
			<td>
			<c:if test="${post.user.id==sessionScope.userSession.id}">
				<a href="<c:url value="Post?action=edit&id=${post.id}"/>">Edit</a>
				<a href="<c:url value="Post?action=delete&id=${post.id}"/>">Delete</a>
				</c:if>
			</td>
		</tr>
	</table>
	<fieldset>
		<legend>Comment</legend>
		<form action="Comment" method="post">
			<input type="hidden" name="PostID"
				value="<c:out value='${post.id}'/>">
			<table>
				<tr>
					<td><textarea name="content" rows="10" cols="50"></textarea></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"><input
						type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<table>
		<c:forEach var="comment" items="${post.comment}">
			<tr>
				<td>
					${comment.content}
					<br /> 
					<c:if test="${comment.user._id==sessionScope.userSession.id}">
						<a href="<c:url value="Comment?action=edit&PostID=${post.id}&id=${comment._id}"/>">Edit</a>
						<a href="<c:url value="Comment?action=delete&PostID=${post.id}&id=${comment._id}"/>">Delete</a>
					</c:if>
					<hr>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>