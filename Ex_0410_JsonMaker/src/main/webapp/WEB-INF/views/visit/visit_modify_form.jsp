<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>visit_modify_form.jsp</title>
		
		<script src="/visit/resources/js/httpRequest.js"></script>
		<script type="text/javascript">
			function send(f){
				let idx= f.idx.value;
				let name = f.name.value;
				let content = f.content.value;
				let pwd = f.pwd.value.trim();
				if(pwd == ''){
					alert("비밀번호 필수");
					return;
				}
				
				var url = "visit_modify.do";
				var param = "idx=" + idx + "&name=" + name +
					"&content="+encodeURIComponent(content)+"&pwd=" + encodeURIComponent(pwd);
				
				sendRequest(url, param, resultFn, "post");
			} // end of send()
			
			function resultFn(){
				if(xhr.readyState == 4 && xhr.status == 200){
					var data = xhr.responseText;
					alert(data);
					
					location.href = "visit_list.do";
					
				} // end of resultFn()
			} // end of resultFn()
		</script>
	</head>
	<body>
		<form>
			<input type="hidden" name="idx" value="${ vo.idx }" />
			<table border="1" align="center">
				<caption>게시글 수정하기</caption>
				
				<tr>
					<th>작성자</th>
					<td><input type="text" name="name" value=${ vo.name } /></td>
				</tr>
				<tr>
					<th>내용</th>
					<td>
						<textarea name="content" id="" cols="50" rows="5" style="resize: none;" wrap="on">${vo.content}</textarea>
					</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="pwd" value="${ vo.pwd }" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="수정하기" onclick="send(this.form);" />
						<input type="button" value="목록으로" onclick="location.href='visit_list.do'" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>