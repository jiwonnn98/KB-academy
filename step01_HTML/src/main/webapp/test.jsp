<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>JSP ������</h1>
<%//�ڹ� ����
	String message = "����Ŀ�";
	out.println("<h3> " + message + "</h3>");
%>
<h4>
�޽��� : <%=message%>
</h4>
</body>
</html>