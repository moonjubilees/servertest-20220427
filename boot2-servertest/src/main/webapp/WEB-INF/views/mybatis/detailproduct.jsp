<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis-boot 연동 (detailproduct.jsp)</title>
<script src="resources/jquery-3.6.0.min.js" />
<script>
	$(document).ready(function(){
		
	});
</script>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<c:if test="${!empty param.code }">
	<h3>코드 : ${code }</h3>
	<h3>이름 : ${product.productname }</h3>
	<h3>가격 : ${product.price }</h3>
	<h3>제조회사/원산지 : ${product.company }</h3>
	<h3>재고량 : ${product.balance }</h3>
	<h3>입고일 : ${product.regdate }</h3>
</c:if>

</body>
</html>