<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page</title>
</head>
<body>
<h1>page</h1>
<%
	// page : Object로 객체 자신을 참조할 경우 사용
	// HttpJspPage pp = page;  page의 return은 Object
	HttpJspPage pp = (HttpJspPage)page;
	
	Enumeration en = this.getInitParameterNames();
	
	// en = page.getInitParameterNames();
	// en = pp.getInitParameterNames();
	en = pp.getServletConfig().getInitParameterNames();
	en = config.getInitParameterNames();
%>
page<br/>
<%= page %><br/>
<%= pp %><br/>
<%= this %><br/>
pp.getSetvletConfig = config<br/>
<%= config %><br/>
<%= pp.getServletConfig() %><br/>
getServletInfo<br/>
<%= this.getServletInfo() %><br/>
<%= pp.getServletInfo() %><br/>
<!-- page.getServletInfo() -->
</body>
</html>