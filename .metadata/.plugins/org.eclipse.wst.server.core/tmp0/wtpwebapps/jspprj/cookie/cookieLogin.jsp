<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 로그인</title>
</head>
<body>
	<form action="cookieLoginRes.jsp" method="post">
		<table border="">
			<tr>
				<td>id</td>
				<td><input type="text" name="pid" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="text" name="pw" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인" /></td>
			</tr>
		</table>
	</form>
	이전 로그인<br/>
	<%
		Cookie [] coos = request.getCookies();
	
		for (Cookie cc : coos) {
	%>
	<%= cc.getName() %> : <%= cc.getValue() %> <br/>
	<%
		}
	%>
</body>
</html>