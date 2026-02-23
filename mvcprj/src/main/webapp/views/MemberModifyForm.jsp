<%@page import="db_p.MemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<% MemDTO dto = (MemDTO)request.getAttribute("mainData"); %>
<body>
<h1>회원 정보 수정</h1>
<form action="MemberModifyReg" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>회원ID</td>
		<td><input type="text" name="mid" value="<%= dto.getMemid() %>" readonly /></td>
	</tr>
	<tr>
		<td>회원명</td>
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
		<td>회원사진</td>
		<% if (dto.getImg() == null) { %>
		<td></td>
		<% } else { %>
		<td><img src="../up/<%= dto.getImg() %>" width="200px" /></td>
		<% } %>
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
		<td colspan="2" align="right"><input type="submit" value="완료" /> <a href="MemberDetail?id=<%= dto.getMemid() %>">취소</a></td>
	</tr>
</table>
</form>
</body>
</html>