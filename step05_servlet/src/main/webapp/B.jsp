<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>B.jsp 입니다.</h1>
<%
	//jsp java 문법
	//parameter로 전송되는 데이터 가져오기
	String name = request.getParameter("name");
	String blood =request.getParameter("blood");
	out.println("<h3>이름 : " + name +"</h3>" );

%>
</body>
</html>