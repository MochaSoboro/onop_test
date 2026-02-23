<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp lifecycle</title>
</head>
<body>
	<h1>jsp lifecycle</h1>
	<!-- 
		JSP script 요소
		1. 선언
		2. 스크립틀릿
		3. 표현식
		4. 주석
		
	 -->
	 
	 <%!
	 	// 선언 : 클래스 정의	jlife.jsp -> jlife_jsp.java
	 	// 최초 로드시 실행
	 	int aa = 1111;	// 멤버변수
	 	
	 	void meth_2() {
	 		System.out.println("meth_2() 실행: "+ ++aa);
	 		// out.print("out 출력");		선언부에서 내장객체 접근 불가능
	 	}
	 	
	 	public void jspInit() {
	 		System.out.println("jspInit() 실행");		// 최초 로드시 실행
	 	}
	 	
	 	public void jspDestroy() {
	 		System.out.println("jspDestroy() 실행");	// 소멸시 실행
	 	}
	 	
	 	/*	무의미함. 스크립틀릿 구간으로 service 구현해야 함
	 	public void jspService() {
	 		System.out.println("jspService() 실행");
	 	}
	 	*/
	 %>
	
	<%
		// 스크립틀릿 : _jspService()에 해당 --> 메소드, 메소드 안에서 메소드 정의 불가
		// 메소드 새로고침(요청) 이 있을 때마다 호출
		
		int a = 10;	// 지역변수
		String b = "아기상어";
		
		// 이너클래스
		class AAA {
			
		}
		
		System.out.println("스크립틀릿 실행 1");
		
		out.println("out 출력 1"+ ++a);	// out -> 클라이언트에 작성하는 stream 객체
		out.println("out 출력 2"+b);
		out.print("out 출력 3<br/>");
		out.print("out 출력 4<br/>");
		out.print("out 출력 5<br/>");
		
		System.out.println("스크립틀릿 실행 2");
		
		// 메소드 내에서 메소드 정의 불가
		// void meth() {}
		
		for (int i=0; i<5; i++) {
			out.print(i+"<br/>");
		}
	%>
	
	<div>html 구간</div>
	<div>
		out.print("out 출력입니다. "+a);
		<br/>
		a : <%= a %>
		<br/>
		b : <%= b %>	<%-- <%= %> 표현식 : out.print와 같다. --%>
		<%-- JSP 주석 --%>
	</div>
	<!-- java 코드로 작성되지 않고 일반적인 문자열 -->
	
	<%
		out.print("out 출력입니다. "+a);
		System.out.println("스크립틀릿 실행 3");
	%>
	
	
	
	
	<style>
		.box {
			width: 100px;
			height: 20px;
			border: 1px solid #333;
		}
	</style>
	<% for(int i=10; i<50; i+=10) { %>
		<div class="box">box <%= i %></div>
	<% } %>
	
	<%
		meth_2();	// 메소드 호출
	%>
	
</body>
</html>