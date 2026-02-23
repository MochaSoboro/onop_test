<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	// 멤버변수
	int c = 100;
%>
<%
	// 지역변수
	int b = 200;
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr = (int [])request.getAttribute("arr");
%>

<h2>aaa</h2>

<%-- inc1 : <%= a %>, <%= b %> 변수 공유하지 않음 --%>
<%= c %>, <%= b %>, <%= request.getParameter("pid") %>, <%= request.getParameter("pname") %>
, <%= request.getParameter("addr") %>, <%= request.getParameter("gender") %><br/>
<%= now.getDay() %>, <%= mem %>, <%= Arrays.toString(arr) %>