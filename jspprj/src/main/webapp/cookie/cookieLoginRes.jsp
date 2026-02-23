<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 로그인 Res</title>
</head>
<%
	Cookie pid = new Cookie("pid", request.getParameter("pid"));
	Cookie pw = new Cookie("pw", request.getParameter("pw"));
	
	response.addCookie(pid);
	response.addCookie(pw);
%>
<body>
	<form action="joinReg.jsp" method="post">
		<table border="">
			<tr>
				<td>id</td>
				<td><%= request.getParameter("pid") %></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%= request.getParameter("pw") %></td>
			</tr>
		</table>
	</form>
</body>
</html>