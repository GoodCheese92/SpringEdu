<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>board_list.jsp</title>
	</head>
	<body>
		안녕하세요.<br>
		<ui>
		<c:forEach var="fruit" items="${ list }">
			<li>${ fruit }</li>			
		</c:forEach>
		</ui>
	</body>
</html>