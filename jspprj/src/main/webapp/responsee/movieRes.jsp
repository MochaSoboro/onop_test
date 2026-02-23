<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예매 확인</title>
</head>
<body>
<%
	Map<String, String> movies = new HashMap<>();
	movies.put("ironman", "movieironman.jsp");
	movies.put("superman", "moviesuperman.jsp");
	movies.put("martman", "moviemartman.jsp");
	
	String url = movies.get(request.getParameter("movie"));
	String people = request.getParameter("people");
	response.sendRedirect(url+"?people="+people);
%>
</body>
</html>