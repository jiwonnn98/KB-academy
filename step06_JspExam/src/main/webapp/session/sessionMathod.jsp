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
session.isNew() = <%=session.isNew()%><br>
session.getId() = <%=session.getId()%><br>
session.getMaxInactiveInterval() = <%=session.getMaxInactiveInterval() %><br>
session.getLastAccessedTime() = <%=session.getLastAccessedTime() %><br>
session.getCreationTime() = <%=session.getCreationTime() %><br>

<%
//세션에 정보를 저장해보자

session.setAttribute("id", "jung");
session.setAttribute("hobbys", Arrays.asList("수영, 헬스, 독서"));
session.setAttribute("age", 20);

request.setAttribute("message", "request에 저장된 정보");

%>

아이디 : <%=session.getAttribute("id") %><br>
취미 : <%=session.getAttribute("hobbys") %><br>
나이 : <%=session.getAttribute("age") %><br>

메시지 : <%=request.getAttribute("message") %><br>

<a href="sessionGet.jsp"> 확인하러고고</a>

</h3>
</body>
</html>