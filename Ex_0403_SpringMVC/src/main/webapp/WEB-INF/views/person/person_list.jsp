<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>person_list.jsp</title>
	</head>
	<body>
		<table border="1" style="margin:5px auto;">
			<caption>사람정보</caption>
			<tr>
				<th>이름</th>
				<th>나이</th>
				<th>전화번호</th>
			</tr>
			<c:forEach var="person" items="${ list }">
			<tr>
				<td>${ person.name }</td>	
				<td>${ person.age }</td>	
				<td>${ person.tel }</td>
			</tr>	
			</c:forEach>
			<tr>
				<td colspan="3" align="center">${ ip }</td>
			</tr>
		</table>
	</body>
</html>