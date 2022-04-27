<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script srt="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<h2>회원정보 수정 결과</h2>

<c:if test="${result == 1}">
	<h3>회원정보 수정 완료</h3>
</c:if>

<a href="membermybatislist">회원리스트 확인</a>

</body>
</html>