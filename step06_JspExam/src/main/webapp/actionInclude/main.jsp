<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div{
border : black 1px solid;
text-align : center;
}
</style>
</head>
<body>

<%
String addr = "제주도";
request.setCharacterEncoding("UTF-8");
%>
<div><jsp:include page="header.jsp"/></div>


<h1> 여기는 메인 영역입니다. </h1>

<hr color="red">

<jsp:include page="footer.jsp">
<jsp:param value="<%=addr %>" name="addr"/>
</jsp:include>

</body>
</html>