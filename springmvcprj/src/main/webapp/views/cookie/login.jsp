<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>LOGIN</h1>
<form action="view" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이전 로그인</td>
			<td><%= request.getAttribute("pname") %></td>
		</tr>
		<tr>
			<td>ID</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>PASSWORD</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="LOGIN" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>