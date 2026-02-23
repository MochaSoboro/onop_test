<%@page import="db_p.MemDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% ArrayList<MemDTO> mainData = (ArrayList<MemDTO>)request.getAttribute("mainData"); %>
<body>
<h1>회원 목록</h1>
<%= mainData %>
<table border="">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>이메일</td>
		<td>전화번호</td>
		<td>주소</td>
		<td>사진</td>
		<td>가입일</td>
		<td>생일</td>
	</tr>
	<% for(MemDTO dto : mainData) { %>
	<tr>
		<td><a href="MemberDetail?id=<%= dto.getMemid() %>"><%= dto.getMemid() %></a></td>
		<td><%= dto.getMname() %></td>
		<td><%= dto.getEmail() %></td>
		<td><%= dto.getTel() %></td>
		<td><%= dto.getAddr() %></td>
		<td><%= dto.getImg() %></td>
		<td><%= dto.getRegdate() %></td>
		<td><%= dto.getBirth() %></td>
	</tr>
	<% } %>
	<tr>
		<td colspan="8"><a href="MemberInsertForm">회원가입</a></td>
	</tr>
</table>
</body>
</html>