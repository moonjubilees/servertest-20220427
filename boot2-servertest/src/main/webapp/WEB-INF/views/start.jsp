<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.6.0.min.js" ></script>
<script>
	$(document).ready(function(){
		$("h1").css("color", "olive");
		$("#ajaxbtn").on("click", function(){
			$.ajax({
				url : '/helloajax',
				data : 'json',
				type : 'get',
				success : function(result){
					$("#result").html(result.id + " : " + result.pw);
				}
				
			})
		});
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<img alt="" src="/images/jquery.png">
<h1>${model } 완료</h1>

<input type="button" value="ajax요청" id="ajaxbtn">
<div id="result" ></div>

</body>
</html>