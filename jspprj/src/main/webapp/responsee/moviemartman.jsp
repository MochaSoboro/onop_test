<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MartMan</title>
</head>
<body>
	<h1>MartMan</h1>
	<table border="">
		<tr>
			<td>관람 인원수</td>
			<td><%= Integer.parseInt(request.getParameter("people"))+2 %></td>
		</tr>
	</table>
</body>
</html>