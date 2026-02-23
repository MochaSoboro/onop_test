<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie select</title>
</head>
<body>
	<h1>select movie</h1>
	<form action="movieRes.jsp" method="post">
		<table border="">
			<tr>
				<td>영화</td>
				<td>
					<input type="radio" name="movie" value="ironman" />아이언맨
					<input type="radio" name="movie" value="superman" />슈퍼맨
					<input type="radio" name="movie" value="martman" />마트맨
				</td>
			</tr>
			<tr>
				<td>인원</td>
				<td><input type="text" name="people" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="예매" /></td>
			</tr>
		</table>
	</form>
</body>
</html>