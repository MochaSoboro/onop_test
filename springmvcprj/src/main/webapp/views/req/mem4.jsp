<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>mem4</h1>
	person : <%= request.getAttribute("person") %><br/>
	pr : <%= request.getAttribute("pr") %>
	<table border="">
		<tr>
			<td>NAME</td>
			<td>
				<%= request.getParameter("pname") %>
			</td>
		</tr>
		<tr>
			<td>AGE</td>
			<td>
				<%= request.getParameter("age") %>
			</td>
		</tr>
		<tr>
			<td>MARRIAGE</td>
			<td>
				<%= request.getParameter("marriage") %>
			</td>
		</tr>
		</table>
</body>
</html>