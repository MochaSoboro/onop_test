<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@page import="basic_p.LogMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>ccc</h2>

<%
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr = (int [])request.getAttribute("arr");
%>

<%= request.getParameter("pname") %>, <%= request.getParameter("pid") %><br/>
<%= now.getDay() %>, <%= mem %>, <%= Arrays.toString(arr) %><br/>

<!-- 
html 태그 (프론트 태그)는 url 기준
<img src="../../fff/cat2.jpg" /> 
contextPath를 사용하는 것이 좋다
-->
<img src="../fff/cat2.jpg" />