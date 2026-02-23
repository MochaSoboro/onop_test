<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>이력서 등록 결과</h1>
<form action="/jspprj/JoinReg" enctype="multipart/form-data" method="post">
	<table border="">
		<tr>
			<td>이름</td>
			<td><%= request.getAttribute("name") %></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><%= request.getAttribute("birth") %></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%= request.getAttribute("addr") %></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><img src="up/<%= request.getAttribute("img") %>" width="100px" /> </td>
		</tr>
	</table>
</form>
</body>
</html>