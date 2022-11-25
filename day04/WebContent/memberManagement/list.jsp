<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>


<section>
	<h3>회원 목록</h3>

	<table>
		<tr>
			<td>아이디</td>
			<td>비밀번호</td>
			<td>사용자 이름</td>
			<td>나이</td>
		</tr>
		
		<% handler.setDummy(); %>
		
		<% for (Member m : handler.getList()){ %>
		<tr>
			<td><%= m.getUserid() %></td>
			<td><%= m.getUserpw() %></td>
			<td><%= m.getUsername() %></td>
			<td><%= m.getAge() %></td>
		</tr>
		<% } %>
	</table>
</section>
</body>
</html>