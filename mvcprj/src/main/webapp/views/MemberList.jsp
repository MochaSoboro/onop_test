<%@page import="db_p.MemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList</title>
</head>
<% ArrayList<MemDTO> mainData = (ArrayList<MemDTO>)request.getAttribute("mainData"); %>
<body>
<h1>회원 목록</h1>

<table border="">
	<tr>
		<td>회원ID</td>
		<td>회원명</td>
		<td>Email</td>
		<td>전화번호</td>
		<td>주소</td>
		<td>가입일</td>
	</tr>
	<% for (MemDTO dto : mainData) { %>
	<tr>
		<td><a href="MemberDetail?id=<%= dto.getMemid() %>"><%= dto.getMemid() %></a></td>
		<td><%= dto.getMname() %></td>
		<td><%= dto.getEmail() %></td>
		<td><%= dto.getTel() %></td>
		<td><%= dto.getAddr() %></td>
		<td><%= dto.getRegdate() %></td>
	</tr>
	<% } %>
	<tr>
		<td colspan="7" align="center"><a href="MemberInsertForm">회원가입</a></td>
	</tr>
</table>

</body>
</html>