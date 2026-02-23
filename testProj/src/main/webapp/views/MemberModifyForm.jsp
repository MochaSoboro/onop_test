<%@page import="db_p.MemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% MemDTO dto = (MemDTO)request.getAttribute("mainData"); %>
<body>
<h1>회원 정보 수정</h1>
<form action="MemberModifyReg?id="<%= dto.getMemid() %>" method="post">
<table border="">
	<tr>
		<td>아이디</td>
		<td><input type="text" name="memid" value="<%= dto.getMemid() %>" readonly /></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="mname" value="<%= dto.getMname() %>" /></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" value="<%= dto.getEmail() %>" /></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="number" name="tel" value="<%= dto.getTel() %>" /></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><input type="text" name="addr" value="<%= dto.getAddr() %>" /></td>
	</tr>
	<tr>
		<td>사진</td>
		<td><img src="../up/<%= dto.getImg() %>" width="200px"/></td>
	</tr>
	<tr>
		<td>가입일</td>
		<td><%= dto.getRegdate() %></td>
	</tr>
	<tr>
		<td>생일</td>
		<td><input type="date" name="birth" value="<%= dto.getBirth() %>" /></td>
	</tr>
	<tr>
		<td colspan="2" align="right"><a href="MemberDetail?id=<%= dto.getMemid() %>">수정취소</a> <input type="submit" value="완료" /> </td>
	</tr>
</table>
</form>
</body>
</html>