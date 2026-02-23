<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVC</title>
</head>
<body>
<h1>SpringMVC입니다</h1>
<a href="/req/getGo">get</a>
<a href="/req/exam/insert">reqExam</a>
<a href="/req/buyOrder">BuyOrder</a>

<h2>return</h2>
<a href="/ret/vv">vv</a>
<a href="/ret/vv2">vv2</a>
<a href="/ret/vv3">vv3</a>
<a href="/ret/moAndvv">moAndvv</a>
<a href="/ret/pp1">pp1</a>
<a href="/ret/pp2">pp2</a>
<a href="/ret/per">per</a>
<a href="/ret/arr">arr</a>
<a href="/ret/map">map</a>
<a href="/ret/obj1">obj1</a>
<a href="/ret/obj2">obj2</a>

<h2>rest</h2>
<a href="/rest/vv">vv</a>
<a href="/rest/vv2">vv2</a>
<a href="/rest/vv3">vv3</a>
<a href="/rest/moAndvv">moAndvv</a>
<a href="/rest/pp1">pp1</a>
<a href="/rest/pp2">pp2</a>
<a href="/rest/per">per</a>
<a href="/rest/arr">arr</a>
<a href="/rest/map">map</a>
<a href="/rest/obj1">obj1</a>
<a href="/rest/obj2">obj2</a>

<h2>file</h2>
<a href="/file">form</a>

<h2>Cookie</h2>
<a href="/coo/make">make</a>
<a href="/coo/view">view</a>
<a href="/coo/modify">modify</a>
<a href="/coo/delete">delete</a>
<a href="/coo/login">login</a>

<h2>session</h2>
<a href="/session/make">make</a>
<a href="/session/view">view</a>
<a href="/session/modify">modify</a>
<a href="/session/delete">delete</a>
<a href="/session/logMain">login</a>

<h2>model</h2>
<a href="/mmm/hello">hello</a>
<a href="/mmm/hello?zipcode=111&addr1=서울&addr2=남산">hello2</a>
<a href="/mmm/hello?zipcode=222&addr1=서울&addr2=코엑스">hello3</a>
<a href="/mmm/history">history</a>
<a href="/mmm/history?zipcode=111&addr1=창원&addr2=sk테크노파크">history2</a>
<a href="/mmm/history?zipcode=222&addr1=창원&addr2=성산아트홀">history3</a>
<a href="/company/info">회사게시판</a>

<h2>path</h2>
<a href="/path/info/aaa/detail">info/aaa/detail</a>
<a href="/path/info/aaa/insert">info/aaa/insert</a>
<a href="/path/gall/aaa/detail">gall/aaa/detail</a>
<a href="/path/gall/aaa/list">gall/aaa/list</a>
<a href="/path/product/aaa/modify">product/aaa/modify</a>
<br/>
<a href="/path/info/bbb">info/bbb</a>
<a href="/path/gall/bbb">gall/bbb</a>
<a href="/path/info/27">info/27</a>
<a href="/path/gall/15">gall/15</a>
<br/>
<a href="/path/info/ddd/detail">info/ddd/detail</a>
<a href="/path/info/ddd/insert">info/ddd/insert</a>
<a href="/path/gall/ddd/detail">gall/ddd/detail</a>
<a href="/path/gall/ddd/list">gall/ddd/list</a>
<a href="/path/product/ddd/modify">product/ddd/modify</a>
<br/>
<a href="/path/info/ddd/detail?pNo=10">info/ddd/detail?pNo</a>
<a href="/path/info/eee/detail/20">info/eee/detail/20</a>
<!-- 
parameter 값이 뒤에 들어갔기 때문에, pNo에는 parameter 값인 30이 들어감
pathData: PathData(cate=info, service=detail, pNo=30)
 -->
<a href="/path/info/eee/detail/20?pNo=30">info/eee/detail/20?pNo</a>

<h2>pc</h2>
<a href="/pc/mlist">mList</a>
<a href="/pc/mdetail">mDetail</a>
<a href="/pc/minsert">mInsert</a>
<a href="/stud/slist">학생목록</a>

<h2>validation</h2>
<a href="/val">validation</a>
<a href="/val/reg">회원가입</a>

<h3>init</h3>
<a href="/initGo?birth=1999-03-20">initGo</a>
<a href="/initGo2?reg_date=2011-03-20">initGo2</a>

<h2>interceptor</h2>
<a href="/inter/event/abc">abc</a>
<a href="/inter/event/efg">efg</a>
<a href="/inter/event/hij">hij</a>

</body>
</html>