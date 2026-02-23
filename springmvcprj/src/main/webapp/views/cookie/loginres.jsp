<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= request.getAttribute("pname") %></title>
</head>
<body>
<h1>LOGIN <%= request.getAttribute("pname") %></h1>
<form action="logout" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>NAME</td>
			<td><%= request.getAttribute("pname") %></td>
		</tr>
		<tr>
			<td>ID</td>
			<td><%= request.getAttribute("pid") %></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="LOGOUT" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>