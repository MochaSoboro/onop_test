<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>파일 업로드 form</h1>
<h1>reg1</h1>
<form action="file/reg1" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>NAME</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>AGE</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>FILE1</td>
			<td><input type="file" name="ff1" multiple /></td>
		</tr>
		<tr>
			<td>FILE2</td>
			<td><input type="file" name="ff2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입" />
			</td>
		</tr>
	</table>
</form>
<h1>reg2</h1>
<form action="file/reg2" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>NAME</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>AGE</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>FILE1</td>
			<td><input type="file" name="ff1" multiple /></td>
		</tr>
		<tr>
			<td>FILE2</td>
			<td><input type="file" name="ff2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입" />
			</td>
		</tr>
	</table>
</form>
<h1>reg3</h1>
<form action="file/reg3" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>NAME</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>AGE</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>FILE1</td>
			<td><input type="file" name="ff1" multiple /></td>
		</tr>
		<tr>
			<td>FILE2</td>
			<td><input type="file" name="ff2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="가입" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>