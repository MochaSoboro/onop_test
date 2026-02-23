<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>이력서</h1>
<form action="/jspprj/JoinReg" enctype="multipart/form-data" method="post">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="birth" /></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="addr" /></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="img" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>