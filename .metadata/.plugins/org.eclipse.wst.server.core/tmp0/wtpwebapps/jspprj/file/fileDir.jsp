<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.io.File"%>
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
	File [] arr = new File(request.getServletContext().getRealPath("fff")).listFiles();

	for (File file : arr) { %>
		<a href="../FFFDown?fName=<%= file.getName() %>"><%= file.getName() %></a><br/>
	<% } %>
	
</body>
</html>