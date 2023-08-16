<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>JSP 맛보기</h1>
<%//자바 영역
	String message = "배고파요";
	out.println("<h3> " + message + "</h3>");
%>
<h4>
메시지 : <%=message%>
</h4>
</body>
</html>