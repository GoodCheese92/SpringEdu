<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>visit_client.jsp</title>
		<script src="js/httpRequest.js"></script>
		
		<script type="text/javascript">
			<!-- 브라우저 실행 시 가장 먼저 호출되는 영역 -->
			window.onload = function(){
				var url = "http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20120101";
				sendRequest(url, null, resultFn, "get");
			} // end of window.onload
			
			function resultFn(){
				// alert(xhr.readyState);
				// alert(xhr.status);
				if(xhr.readyState == 4 && xhr.status == 200){
					var data = xhr.responseText; // 서버에서 도착한 json형태의 문자열
				
					// data를 실제 json 구조로 변경
					var json = (new Function( 'return' + "[" + data + "]" ))();
					
					var result = "";
					// result = json[0].boxOfficeResult.dailyBoxOfficeList[0].movieNm;
					
					for(var i = 0; i < json.lentgh; i++){
						result += json[0].boxOfficeResult.dailyBoxOfficeList[i].rank + " / " + json[0].boxOfficeResult.dailyBoxOfficeList[i].movieNm + "<br>";
					} // end of for 
					
					var disp = document.getElementById("disp");
					disp.innerHTML = result;
					
				} // if
			} // end of resultFn()
		</script>
		
	</head>
	
	<body>
		<div id="disp">
			
		</div>
	</body>
</html>





























