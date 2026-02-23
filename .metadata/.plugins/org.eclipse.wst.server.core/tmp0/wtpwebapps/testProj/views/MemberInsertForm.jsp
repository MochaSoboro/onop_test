<%@page import="db_p.MemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원 정보 수정</h1>
<form action="MemberInsertReg" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="memid"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="mname"/></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email"/></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="number" name="tel"/></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" name="addr"/></td>
	</tr>
	<tr>
		<td>사진</td>
		<td><input type="file" name="img"/></td>
	</tr>
	<tr>
		<td>생일</td>
		<td><input type="date" name="birth"/></td>
	</tr>
	<tr>
		<td colspan="2" align="right"><a href="MemberList">가입취소</a> <input type="submit" value="완료" /> </td>
	</tr>
</table>
</form>
</body>
</html>