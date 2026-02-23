<%@page import="aaa.mmm.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>RES</h1>
<% Student st = (Student)request.getAttribute("student"); %>
<table border="">
	<tr>
		<td width="100px">NAME</td>
		<td width="100px"><%= st.getName() %></td>
	</tr>
	<tr>
		<td>KOREAN</td>
		<td><%= st.getKor() %></td>
	</tr>
	<tr>
		<td>ENGLISH</td>
		<td><%= st.getEng() %></td>
	</tr>
	<tr>
		<td>MATH</td>
		<td><%= st.getMat() %></td>
	</tr>
	<tr>
		<td>TOTAL</td>
		<td><%= st.getTot() %></td>
	</tr>
	<tr>
		<td>AVERAGE</td>
		<td><%= st.getAvg() %></td>
	</tr>
	<tr>
		<td>RANK</td>
		<td><%= st.getRank() %></td>
	</tr>
</table>
</body>
</html>