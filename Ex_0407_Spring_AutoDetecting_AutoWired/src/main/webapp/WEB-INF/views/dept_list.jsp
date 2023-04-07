<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>dept_list.jsp</title>
	</head>
	<body>
		<table border="1" align="center">
			<caption>부서정보</caption>
			<tr>
				<th>부서번호</th>
				<th>부서이름</th>
				<th>부서위치</th>
			</tr>
			<c:forEach var="vo" items="${ list }">
				<tr>
					<td>${ vo.deptno }</td>				
					<td>${ vo.dname }</td>				
					<td>${ vo.loc }</td>				
				</tr>
			</c:forEach>
			
		</table>
	</body>
</html>