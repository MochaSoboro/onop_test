<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("page", "compBorder.jsp");
	String nowpage;
%>
<button onclick="location.href='./compBorder.jsp?page=introduce'">회사소개</button>
<button onclick="location.href='./compBorder.jsp?page=gall'">갤러리</button>
<button onclick="location.href='./compBorder.jsp?page=mypage'">마이페이지</button>
<button onclick="location.href='./compBorder.jsp?page=notice'">공지사항</button>
<br/>
<% nowpage = (String)request.getParameter("page"); %>
<%= nowpage %>
<jsp:include page="<%= nowpage %>"></jsp:include>
</body>
</html>