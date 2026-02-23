<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>err04</title>
</head>
<body>
<h1>err04</h1>
<%

	int [] arr = {11, 22, 33};
	out.println(arr[5]);	// 500 에러로 진입
	out.println("정상실행");

%>
</body>
</html>