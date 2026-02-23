<%@page import="java.util.Arrays"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
</head>
<body>
	<h1>request</h1>
	<%
		HttpServletRequest reqq1 = request;
		ServletRequest reqq2 = pageContext.getRequest();
		out.println(request+"<br/>");
		out.println(reqq1+"<br/>");
		out.println(reqq2+"<br/>");
		
		// 접속한 주소 : http://localhost:8080/jspprj/request/req.jsp
		out.println(request.getRemoteAddr()+"<br/>");	// 0:0:0:0:0:0:0:1
		out.println(request.getRemoteHost()+"<br/>");	// 0:0:0:0:0:0:0:1
		out.println(request.getRemoteUser()+"<br/>");	// null
		out.println(request.getProtocol()+"<br/>");		// HTTP/1.1
		out.println(request.getServerName()+"<br/>");	// localhost
		
		out.println(request.getMethod()+"<br/>");		// GET
		out.println(request.getContentType()+"<br/>");	// null
		out.println(request.getContentLength()+"<br/>");	// -1
		out.println(request.getRequestURL()+"<br/>");	// http://localhost:8080/jspprj/request/req.jsp
		out.println(request.getRequestURI()+"<br/>");	// /jspprj/request/req.jsp
		out.println(request.getContextPath()+"<br/>");	// /jspprj
		out.println(request.getCharacterEncoding()+"<br/>");	// UTF-8
		out.println(request.getHeader("referer")+"<br/>");		// http://localhost:8080/jspprj/
		out.println(request.getHeader("User-Agent")+"<br/>");	// Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36

		
		String enTTT = URLEncoder.encode("붉은말", "UTF-8");
		System.out.println(enTTT);	// %EB%B6%89 %EC%9D%80 %EB%A7%90

		out.println("<hr/>");
		
		Enumeration<String> en = request.getParameterNames();
		
		while (en.hasMoreElements()) {
			out.println(en.nextElement()+"<br/>");
		}
		
		out.println(request.getParameter("no")+"<br/>");
		out.println(request.getParameter("pname")+"<br/>");
		out.println(request.getParameter("marriage")+"<br/>");
		out.println(request.getParameter("hobby")+"<br/>");
		
		String [] hobbys = request.getParameterValues("hobby");
		out.println(Arrays.toString(hobbys));
	%>
</body>
</html>