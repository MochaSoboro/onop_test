<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>bbb</h1>


<%
	// 지역변수
	int b = 200;
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr = (int [])request.getAttribute("arr");
%>

<%-- inc1 : <%= a %>, <%= b %> 변수 공유하지 않음 --%>
<%= b %>, <%= request.getParameter("pid") %>, <%= request.getParameter("pname") %>
, <%= request.getParameter("addr") %>, <%= request.getParameter("gender") %><br/>
<%= now.getDay() %>, <%= mem %>, <%= Arrays.toString(arr) %><br/>


<img src="../fff/cat1.jpg" width="500px" />
<jsp:include page="ccc.jsp"></jsp:include>
</body>
</html>