<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>temp</title>
<style>
	div {
		width: 400px;
		box-sizing: border-box;
		display: flex;
	}
	.header {
		border: 1px solid #ddd;
		height: 50px;
		box-sizing: border-box;
	}
	.mainwrapper {
		text-align: center;
		line-height: 100px;
	}
	.main {
		border: 1px solid #ddd;
		height: 100px;
		width: 300px;
		box-sizing: border-box;
	}
	.footer {
		border: 1px solid #ddd;
		height: 50px;
		text-align: center;
		line-height: 50px;
		box-sizing: border-box;
	}
	.side {
		border: 1px solid #ddd;
		box-sizing: border-box;
		height: 100px;
		width: 100px;
	}
</style>
</head>
<body>
<h1>게시판</h1>
<div class="header">
	<%@ include file="top.jsp" %>
	<jsp:include page="top.jsp"></jsp:include>
</div>
<div class="mainwrapper">
<div class="side">
사이드메뉴
</div>
<div class="main">
	${ main }
</div>
</div>
<div class="footer">
<%@ include file="bottom.jsp" %>
</div>
</body>
</html>