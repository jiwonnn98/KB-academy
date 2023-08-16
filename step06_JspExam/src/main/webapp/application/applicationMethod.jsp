<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> ServletContext - application</h2>
<h3>
application.getRealPath("/") = <%=application.getRealPath("/") %>
application.getContextPath("/") = <%=application.getContextPath() %>

<%
//applicaion 영역에 정보를 저장해보자
application.setAttribute("addr", "서울 선릉");
application.setAttribute("message", "application영역의 message");
%>

주소 : <%=application.getAttribute("addr") %><br>
메시지 : <%=application.getAttribute("message") %><br>

<a href="../session/sessionGet.jsp">확인하러가자</a><br>
<a href="<%=application.getContextPath()%>/session/sessionGet.jsp">확인하러가자</a><br>

</h3>
</body>
</html>