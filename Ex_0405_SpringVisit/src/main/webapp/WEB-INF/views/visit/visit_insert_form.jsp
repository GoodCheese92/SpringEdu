<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>visit_insert_form.jsp</title>
		
		<script type="text/javascript">
			function send(f){
				let name = f.name.value.trim();
				let content = f.content.value.trim();
				let pwd = f.pwd.value.trim();
				
				// 유효성 체크
				if(name == ''){
					alert("이름을 입력하세요.");
					f.name.focus();
					return;
				}
				
				f.action = "visit_insert.do";
				f.mehod = "post";
				f.submit();
				
			} // end of send()
		</script>
	</head>
	<body>
		<form>
			<table border="1" align="center">
				<caption>새 글 쓰기</caption>
				<tr>
					<th>작성자</th>
					<td><input name="name" /></td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea rows="5" cols="50" name="content" style="resize: none;" wrap="on"></textarea>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="글쓰기" onclick="send(this.form);" />
						<input type="button" value="목록으로" onclick="location.href='visit_list.do'" />
					</td>
				</tr>
			</table>
		</form>	
	</body>
</html>