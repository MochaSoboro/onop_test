<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
img {
	width: 300px;
}
</style>
</head>
<body>
<h1>파일 업로드 완료 reg3</h1>
<h1>reg3</h1>
<form action="reg3" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>NAME</td>
			<td>${ fileData.pname }</td>
		</tr>
		<tr>
			<td>AGE</td>
			<td>${ fileData.age }</td>
		</tr>
		<tr>
			<td>FILE1</td>
			<td>${ fileData.ff1 }</td>
		</tr>
		<tr>
			<td>FILE2</td>
			<td><img src="/fff/${ fileData.ff2.originalFilename }" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<a href="/file">뒤로</a>
			</td>
		</tr>
	</table>
</form>

</body>
</html>