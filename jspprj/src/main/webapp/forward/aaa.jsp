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
<h1>aaa</h1>

<%!
	// 멤버변수
	int a = 10;
%>
<%
	String ff1 = "bbb.jsp";
	String ff2 = "mmm/ccc.jsp";

	// 지역변수
	int b = 20;
	request.setAttribute("now", new Date());
	request.setAttribute("mem", new LogMember("zxc", "셋쇼마루", "123"));
	request.setAttribute("arr", new int[] {11, 22, 33, 44});
%>
aaa : <%= a %>, <%= b %>, <%= request.getParameter("pid") %><br/>
asdfasdf<br/>
asdfa<br/>
sc<br/>
asggn<br/>
sfg<br/>
ndmh<br/>
<!-- 최초 forward가 실행 -->
<jsp:forward page="bbb.jsp?pname=무잔">
	<jsp:param value="지미집" name="addr"/>
	<jsp:param value="f" name="gender"/>
</jsp:forward>	
<jsp:forward page="ccc.jsp"></jsp:forward>	<!-- 실행안함 -->
</body>
</html>