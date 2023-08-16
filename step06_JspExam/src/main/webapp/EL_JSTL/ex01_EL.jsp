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
\${5} = ${5}<br>
\${5*2} = ${5*2}<br>
\${5 gt 2} = ${5 gt 2}<br>
\${5 eq 5} = ${5 eq 5}<br>
\${5==5 && 3<5} = ${5==5 && 3<5}<br>

${param.id } / <%=request.getParameter("id") %><br>

<!-- 만약 id가 있으면 id를 출력하고 없으면 Guest라고 출력 -->

${param.id==null ? "Guest님" : param.id+="님" }<br>
${empty param.id ? "Guest" : param.id.concat("님") }<br>

<%
	request.setAttribute("id", "jiwon");
	
	session.setAttribute("addr", "서울시 강남구");
%>
</h3>
</body>
</html>