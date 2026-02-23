<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logOut</title>
</head>
<body>
<h1>logOut</h1>
<% 
	session.invalidate(); 
	response.sendRedirect("loginMain.jsp");
%>
</body>
</html>