<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 


아이디 : <%=session.getAttribute("id") %><br>
취미 : <%=session.getAttribute("hobbys") %><br>
나이 : <%=session.getAttribute("age") %><br>

메시지 : <%=request.getAttribute("message") %><br>

<hr>

Servlet Context 정보 출력

주소 : <%=application.getAttribute("addr") %><br>
메시지 : <%=application.getAttribute("message") %><br>





</h3>
</body>
</html>