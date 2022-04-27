<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일다운로드 (downloadlist.jsp)</title>
<script srt="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<h2>다운로드 가능 파일 목록을 보여드립니다.</h2>
<hr>

<c:forEach items="${filearray }" var="f">
	${f }
	<a href="filedownloadresult?filename=${f}">다운로드</a>
	<br><hr>
</c:forEach>

</body>
</html>