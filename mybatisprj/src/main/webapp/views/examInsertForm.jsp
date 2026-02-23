<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WRITE</title>
</head>
<body>
<h1>WRITE</h1>
<form action="/exam/examInsertReg/${pageInfo.getPNo()}" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>학기</td>
			<td>
				<input type="radio" name="hakgi" value="1" />1학기
				<input type="radio" name="hakgi" value="2" />2학기
			</td>
		</tr>
		<tr>
			<td>시험 종류</td>
			<td>
				<input type="radio" name="name" value="middle" />middle
				<input type="radio" name="name" value="final" />final
			</td>
		</tr>
		<tr>
			<td>학생ID</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td>국어</td>
			<td><input type="text" name="kor" /></td>
		</tr>
		<tr>
			<td>영어</td>
			<td><input type="text" name="eng" /></td>
		</tr>
		<tr>
			<td>수학</td>
			<td><input type="text" name="mat" /></td>
		</tr>
		<tr>
			<td>파일</td>
			<td><input type="file" name="upff" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="작성" /><a href="/exam/examList/${pageInfo.getPNo()}">뒤로</a></td>
		</tr>
	</table>
</form>
</body>
</html>