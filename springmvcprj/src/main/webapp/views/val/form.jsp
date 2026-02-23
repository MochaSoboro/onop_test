<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spFrm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<h1>유효성검사</h1>
<form method="post">
<table>
	<tr>
		<td>ID</td>
		<td>
		<input type="text" name="pid" />
		<br>
		<spFrm:errors path="person.pid" />
		</td>
	</tr>
	<tr>
		<td>PASSWORD</td>
		<td>
		<input type="text" name="pw" />
		<br>
		<spFrm:errors path="person.pw" />		
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="LOGIN" /></td>
	</tr>
</table>
</form>
</body>
</html>