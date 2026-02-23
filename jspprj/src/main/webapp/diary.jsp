<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>달력</title>
</head>
<body>

	<style>
		div {
			width: 50px;
			height: 30px;
			float: left;
			text-align: center;
			box-sizing: border-box;
		}
		.wrapper {
			width: 350px;
			
		}
	</style>
	<div class="wrapper">
<%
	Calendar today = Calendar.getInstance();
	out.print(today.get(Calendar.YEAR)+"년 "+today.get(Calendar.MONTH)+1+"월<br/>");
	out.print("<div>일</div><div>월</div><div>화</div><div>수</div><div>목</div><div>금</div><div>토</div><br/>");
	today.set(Calendar.DATE, 1);
	int startDate = today.get(Calendar.DAY_OF_WEEK);
	
	String days = "";
	
	for (int i=1; i<startDate; i++) {
		days += "<div></div>";
	}
	
	for (int i=1; i<=today.getActualMaximum(Calendar.DATE); i++) {
		days+="<div>"+i+"</div>";
		today.set(Calendar.DATE, i);
		if (today.get(Calendar.DAY_OF_WEEK) == 7) {
			days+="<br/>";
		}
	}
	
	out.print(days);
	
%>
	</div>
</body>
</html>