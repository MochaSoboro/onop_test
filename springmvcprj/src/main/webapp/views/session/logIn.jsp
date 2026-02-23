<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인화면</title>
</head>
<body>
<h1>메인화면</h1>
<form action="logout">
<table border="">
	<tr>
		<td align="center" width="100px">ID</td>
		<td align="center" width="100px">${ pid }</td>
	</tr>
	<tr>
		<td align="center">NAME</td>
		<td align="center">${ pname }</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="LOGOUT" /></td>
	</tr>
</table>
</form>
</body>
</html>