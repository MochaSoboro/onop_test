<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginReg</title>
</head>
<body>
<h1>loginReg</h1>
<%
	session.setAttribute("pid", request.getParameter("pid"));
	session.setAttribute("pw", request.getParameter("pw"));
%>

현재 로그인 아이디 : <%= session.getAttribute("pid") %><br/>
<a href="logOut.jsp">로그아웃</a>
</body>
</html>