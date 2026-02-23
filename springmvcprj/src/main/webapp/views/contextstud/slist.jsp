<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="aaa.mmm.ContextStud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 목록</title>
</head>
<body>
<h1>학생 목록</h1>
<table border="">
	<tr>
		<td>ID</td>
		<td>KOR</td>
		<td>ENG</td>
		<td>MAT</td>
		<td>TOT</td>
		<td>EVG</td>
	</tr>
<% 
ArrayList<ContextStud> mData = (ArrayList<ContextStud>)request.getAttribute("mData");
for (ContextStud st : mData) { %>
	<tr>
		<td><a href="sdetail?id=<%= st.getId() %>"><%= st.getId() %></a></td>
		<td><%= st.getKor() %></td>
		<td><%= st.getEng() %></td>
		<td><%= st.getMat() %></td>
		<td><%= st.getTotal() %></td>
		<td><%= st.getAverage() %></td>
	</tr>
<% } %>
<tr>
	<td colspan="6" align="right"><a href="sinsertForm">학생추가</a></td>
</tr>
</table>
</body>
</html>