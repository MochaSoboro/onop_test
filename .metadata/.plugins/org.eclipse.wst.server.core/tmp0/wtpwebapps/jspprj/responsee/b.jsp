<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b</title>
</head>
<body>
	<h1>b</h1>
	<%
		System.out.println("b.jsp 진입1");
		response.sendRedirect("c.jsp");	// c.jsp로 이동
		// response.sendRedirect("d.jsp"); 에러 발생
		System.out.println("b.jsp 진입2");	// 정상 실행
	%>
	
	<script type="text/javascript">
	// 모든 명령어가 변환되고 실행된 후 실행됨
	// response.sendRedirect가 있을 경우 실행 안함
		alert("왔어?")
		location.href="e.jsp";	
	</script>
</body>
</html>