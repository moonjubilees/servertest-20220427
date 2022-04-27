<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일업로드 (uploadresult.jsp)</title>
<script srt="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<h2>uploadresult.jsp</h2>
<hr>

<h3>${dto.name }님, ${dto.file1.originalFilename } 와
 ${dto.file2.originalFilename }을 업로드하셨습니다.</h3>
</body>
</html>