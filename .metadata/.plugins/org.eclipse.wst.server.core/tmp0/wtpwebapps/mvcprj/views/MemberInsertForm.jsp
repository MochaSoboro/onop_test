<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberInsertForm</title>
</head>
<body>
<h1>회원가입</h1>
<form action="MemberInsertReg" method="post" enctype="multipart/form-data">
<table border="">
	<tr>
		<td>회원ID</td>	<td><input type="text" name="mid" value="" /></td>
	</tr>
	<tr>
		<td>회원명</td>	<td><input type="text" name="mname" /></td>
	</tr>
	<tr>
		<td>Email</td>	<td><input type="text" name="email" /></td>
	</tr>
	<tr>
		<td>전화번호</td>	<td><input type="number" name="tel" /></td>
	</tr>
	<tr>
		<td>주소</td>		<td><input type="text" name="addr" /></td>
	</tr>
	
	<tr>
		<td>사진</td>		<td><input type="file" name="ff" /></td>
	</tr>
	<tr>
		<td>생일</td>		<td><input type="date" name="birth" /></td>
	</tr>
		
	<tr>
		<td colspan="2" align="center"><input type="submit" value="가입하기" /> <a href="MemberList">목록으로</a></td>
	</tr>
</table>
</form>
</body>
</html>