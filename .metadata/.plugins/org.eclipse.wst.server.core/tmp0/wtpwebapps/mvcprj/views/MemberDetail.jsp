<%@page import="db_p.MemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세</title>
</head>
<% MemDTO dto = (MemDTO)request.getAttribute("mainData"); %>
<body>
<h1>회원 상세</h1>
<table border="">
	<tr>
		<td>회원ID</td>
		<td><%= dto.getMemid() %></td>
	</tr>
	<tr>
		<td>회원명</td>
		<td><%= dto.getMname() %></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><%= dto.getEmail() %></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><%= dto.getTel() %></td>
	</tr>
	<tr>
		<td>주소</td>
		<td><%= dto.getAddr() %></td>
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
		<td><%= dto.getBirth() %></td>
	</tr>
	<tr>
		<td colspan="2" align="right"><a href="MemberModifyForm?id=<%= dto.getMemid() %>">수정</a> <a href="MemberDelete?id=<%= dto.getMemid() %>">삭제</a> <a href="MemberList">목록</a></td>
	</tr>
</table>
</body>
</html>