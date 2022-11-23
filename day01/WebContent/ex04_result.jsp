<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_result.jsp</title>
</head>
<body>
<h1>입력값(파라미터) 받아서 처리하기</h1>
<!-- 파리미터 : 요청을 할 때 부수적으로 전달하는 값  -->
<hr>

<% 
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	int n1 = Integer.parseInt(age);
	String ob;
	
	if(n1 < 20){
		ob = "미성년자";
	}
	else {
		ob = "성인";
	}
	
		
		
%>
	
	<h3><%=name %>님의 나이는 <%=age %>살 <%=ob %>입니다</h3>
	<div>
		<a href="ex04_form.jsp"><button>돌아가기</button></a>
	</div>

</body>
</html>