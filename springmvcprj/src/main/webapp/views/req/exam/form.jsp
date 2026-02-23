<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req/form</title>
</head>
<body>
<h1>req/exam/form</h1>

<form action="examReq" method="get">
	<table border="">
		<tr>
			<td>NAME</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>KOREAN</td>
			<td><input type="text" name="kor" /></td>
		</tr>
		<tr>
			<td>ENGLISH</td>
			<td><input type="text" name="eng" /></td>
		</tr>
		<tr>
			<td>MATH</td>
			<td><input type="text" name="mat" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="write" /></td>
		</tr>
	</table>
</form>


</body>
</html>