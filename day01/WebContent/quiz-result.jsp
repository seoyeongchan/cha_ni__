<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz-result.jsp</title>
</head>
<body>

	<%
	
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String date = request.getParameter("date");
		String s = request.getParameter("s");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		String phone = request.getParameter("phone");
	%>
	<h3><%=name %>님 가입 축하드립니다</h3>
	
	<div>
		<a href="quiz-form.jsp"><button>돌아가기</button></a>
	</div>

</body>
</html>