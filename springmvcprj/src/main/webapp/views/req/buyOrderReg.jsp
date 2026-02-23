<%@page import="aaa.mmm.Product"%>
<%@page import="aaa.mmm.BuyOrder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BuyOrder bo = (BuyOrder)request.getAttribute("bo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BuyOrderReg</title>
</head>
<body>
<h1>주문 완료</h1>
<%-- <%= bo %><br/> --%>
<table border="">
	<tr>
		<td width="70px">제품명</td>
		<td>가격</td>
		<td>개수</td>
		<td width="70px">금액</td>
	</tr>
<% 
for (Product pp : bo.getProds()) { 
%>
	
	<tr>
		<td><%= pp.getPname() %></td>
		<td><%= pp.getPrice() %></td>
		<td><%= pp.getCnt() %></td>
		<td><%= pp.getTot() %></td>
	</tr>
<% 
} 
%>
	<tr>
		<td rowspan="3">주소</td>
		<td>우편번호</td>
		<td><%= bo.getAd().getZipcode() %></td>
		<td>합계</td>
	</tr>
	<tr>
		<td>기본주소</td>
		<td><%= bo.getAd().getAddr1() %></td>
		<td rowspan="2"><%= bo.getTot() %></td>
	</tr>
	<tr>
		<td>상세주소</td>
		<td><%= bo.getAd().getAddr2() %></td>
	</tr>
</table>
</body>
</html>