<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%-- 
	모든 페이지에서 공통으로 사용할 기능이나 객체를 작성해둔다
--%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
a {
	text-decoration: none;
	color:inherit;
}
</style>
</head>
<body>

<h1><a href="ex05-index.jsp">logo</a></h1>
<hr>

<nav>
	<ul>
  <li>a<a href="ex05-List.jsp">목록</a></li>
  <li>a<a href="ex05-add.jsp">추가</a></li>
  <li>a<a href="ex05-delete.jsp">삭제</a></li>
</ul>

</nav>
<%-- 
	단독으로 사용될 일이 없고, 하단에 다른 내용이 추가될 것이므로
	</html>, </body>와 같은 내용을 제거한다
--%>