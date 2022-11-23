<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_form.jsp</title>
</head>
<body>

	<h1>사용자 입력 받기</h1>
	<hr>
<!-- form의 내용을 묶어서 ex04_result.jsp 에게 보낸다 -->
	<form action="ex04_result.jsp">
		<p><input type="text" name="name" placeholder="이름을 입력하세요" required autocomplete="off"></p>
		<p><input type="number" name="age" placeholder="나이를 입력하세요" required autocomplete="off"></p>
		<p><input type="submit"></p>
	</form>
			


</body>
</html>