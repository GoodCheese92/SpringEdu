<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>insert_result.jsp</title>
	</head>
	<body>
		<table border="1" style="margin:5px auto;">
			<caption>사람 정보</caption>
			<tr>
				<th>이름</th>
				<th>나이</th>
				<th>전화번호</th>
			</tr>
			<tr>
				<td>${ vo.name }</td>
				<td>${ vo.age }</td>
				<td>${ vo.tel }</td>
			</tr>
		</table>
	</body>
</html>