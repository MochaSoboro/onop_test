<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="aaa.mmm.ContextStud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 상세</title>
</head>
<body>
<h1>학생 상세</h1>
<table border="">
	<tr>
		<td>ID</td>
		<td>${ mData.getId() }</td>
	</tr>
	<tr>
		<td>KOR</td>
		<td>${ mData.getKor() }</td>
	</tr>
	<tr>
		<td>ENG</td>
		<td>${ mData.getEng() }</td>
	</tr>
	<tr>
		<td>MAT</td>
		<td>${ mData.getMat() }</td>
	</tr>
	<tr>
		<td>TOT</td>
		<td>${ mData.getTotal() }</td>
	</tr>
	<tr>
		<td>AVG</td>
		<td>${ mData.getAverage() }</td>
	</tr>
	<tr>
		<td colspan="2"><a href="slist">목록으로</a></td>
	</tr>
</table>
</body>
</html>