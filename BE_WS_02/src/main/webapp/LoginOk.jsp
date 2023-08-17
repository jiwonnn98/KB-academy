<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공!</title>
</head>
<body>

<h3><%=session.getAttribute("userName") %>님 로그인 중</h3><br>

<img src="https://picsum.photos/200"><br>

<form method="get" action="logout">
  
  <input type="submit" value="로그아웃" />
</form>
</body>
</html>