<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int mat = Integer.parseInt(request.getParameter("mat"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
</head>
<body>
	<h1>examReg</h1>
	<table border="">
			<tr>
				<td>이름</td>
				<td><%= request.getParameter("pname") %></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%= kor %></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%= eng %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%= mat %></td>
			</tr>
			<tr>
				<td>총점</td>
				<td><%= kor+eng+mat %></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%= (kor+eng+mat)/3 %></td>
			</tr>
		</table>
</body>
</html>