<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examModifyReg</title>
</head>
<body>
<h1>쓰기완료</h1>
<script type="text/javascript">
	alert("수정완료")
	location.href="/exam/examDetail/${pageInfo.getPNo()}/${mainData}"
</script>
</body>
</html>