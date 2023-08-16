<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<h1>로그인 성공!!</h1>
<%
	String name = request.getParameter("userId");
	
	out.println("<h3>아이디 : " + name +"</h3>" );

%>
</body>
</html>