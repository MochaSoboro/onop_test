<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<form action="logReg" method="post">
<table border="">
	<tr>
		<td align="center" width="100px">ID</td>
		<td><input type="text" name="pid" /></td>
	</tr>
	<tr>
		<td align="center">PASSWORD</td>
		<td><input type="text" name="pw" /></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="LOGIN" /></td>
	</tr>
</table>
</form>
</body>
</html>