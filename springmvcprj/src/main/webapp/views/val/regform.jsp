<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spFrm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
<h1>회원가입</h1>
<form method="post" action="register">
<table border="">
	<tr>
		<td>ID</td>
		<td>
		<input type="text" name="pid" />
		<br>
		<spFrm:errors path="regPerson.pid" />
		</td>
	</tr>
	<tr>
		<td>PASSWORD</td>
		<td>
		<input type="text" name="password" />
		<br>
		<spFrm:errors path="regPerson.password" />		
		</td>
	</tr>
	<tr>
		<td>NAME</td>
		<td>
		<input type="text" name="pname" />
		<br>
		<spFrm:errors path="regPerson.pname" />		
		</td>
	</tr>
	<tr>
		<td>AGE</td>
		<td>
		<input type="number" name="age" />
		<br>
		<spFrm:errors path="regPerson.age" />		
		</td>
	</tr>
	<tr>
		<td>BIRTH</td>
		<td>
		<input type="text" name="birth" />
		<br>
		<spFrm:errors path="regPerson.birth" />		
		</td>
	</tr>
	<tr>
		<td>EMAIL</td>
		<td>
		<input type="text" name="email" />
		<br>
		<spFrm:errors path="regPerson.email" />		
		</td>
	</tr>
	<tr>
		<td>PHONE NUMBER</td>
		<td>
		<input type="text" name="tel" />
		<br>
		<spFrm:errors path="regPerson.tel" />		
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="SIGN IN" /></td>
	</tr>
</table>
</form>
</body>
</html>