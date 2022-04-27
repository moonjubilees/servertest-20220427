<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring-mybatis 연동 (insertresult.jsp)</title>
<script srt="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<h2>회원가입 결과</h2>

<c:if test="${result == 1}">
	<h3>정상 회원가입 완료</h3>
</c:if>

</body>
</html>