<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring-mybatis 연동 (insertform.jsp)</title>
</head>
<body>

<h2>회원가입양식</h2>
<form action="membermybatisinsert" method="post">
	아이디 : <input type="text" name="id"><br>
	암호 : <input type="password" name="password"><br>
	이름 : <input type="text" name="name"><br>
	전화번호 : <input type="text" name="phone"><br>
	이메일 : <input type="text" name="email"><br>
	주소 : <input type="text" name="address"><br>
	<input type="submit" value="회원가입"><br>
</form>

</body>
</html>