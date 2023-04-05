<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>insert_form.jsp</title>
		
		<script type="text/javascript">
			function send1(f){
				// 유효성 체크
				
				f.action = "insert1.do";
				f.method = "post";
				f.submit();
				
			} // end of send1()
			
			function send2(f) {
				// 유효성 체크
				
				f.action = "insert2.do";
				f.method = "get";
				f.submit();
			} // end of send2()
		</script>
	</head>
	<body>
		<form>
			<table border="1" style="margin:5px auto;">
				<caption>사람 입력 정보</caption>
				<tr>
					<th>이름</th>
					<td><input name="name" /></td>				
				</tr>
				<tr>
					<th>나이</th>
					<td><input name="age" /></td>				
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input name="tel" /></td>				
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="낱개로 전송" onclick="send1(this.form);"/>
						<input type="button" value="객체로 전송" onclick="send2(this.form);"/>
					</td>				
				</tr>
			</table>
		</form>
	</body>
</html>