<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="aaa.mmm.ContextStud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 추가</title>
</head>
<body>
<h1>학생 추가</h1>
<form action="sinsertReg" method="post">
<table border="">
	<tr>
		<td>ID</td>
		<td><input type="text" name="pid"/></td>
	</tr>
	<tr>
		<td>KOR</td>
		<td><input type="text" name="kor"/></td>
	</tr>
	<tr>
		<td>ENG</td>
		<td><input type="text" name="eng"/></td>
	</tr>
	<tr>
		<td>MAT</td>
		<td><input type="text" name="mat"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="slist">목록으로</a>
			<input type="submit" value="추가" />
		</td>
	</tr>
</table>
</form>
</body>
</html>