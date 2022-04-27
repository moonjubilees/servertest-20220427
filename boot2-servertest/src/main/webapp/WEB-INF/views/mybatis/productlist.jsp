<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis-boot 연동 (productlist.jsp)</title>
<script src="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<c:forEach items="${productlist }" var="dto">
	<h3>${dto.productcode }
	<a href="/product?code=${dto.productcode }">${dto.productname }</a>
	${dto.price }</h3>
</c:forEach>

</body>
</html>