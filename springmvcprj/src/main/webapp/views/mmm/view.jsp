<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>model</title>
</head>
<body>
<h1>model</h1>
product : <%= request.getAttribute("product") %><br/>
product : ${ product }<br/>
pp1 : ${ pp1 }<br/>
mData : ${ mData }<br/>
address : ${ address }<br/>
ad1 : ${ ad1 }<br/>
ad2 : ${ ad2 }<br/>
ad3 : ${ ad3 }<br/>
ad4 : ${ ad4 }<br/>
</body>
</html>