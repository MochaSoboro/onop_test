<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><%= request.getAttribute("pname") %></title>
</head>
<body>
<script>

alert("로그아웃 성공")
location.href="/coo/login"
</script>
</body>
</html>