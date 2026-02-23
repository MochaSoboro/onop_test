<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginMain</title>
</head>
<body>
<h1>loginMain</h1>

<%

	if(session.getAttribute("pid")==null){%>
		
	<form action="loginReg.jsp">
	id <input type="text" name="pid" />
	pw <input type="text" name="pw" />
	 <input type="submit" value="로그인" />
	</form>	
		
<% }else{ %>
	현재 로그인 아이디 : <%= session.getAttribute("pid") %><br/>
	<a href="logOut.jsp">로그아웃</a>
<% } %>
</body>
</html>