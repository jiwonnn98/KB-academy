<%@page import="dao.MemberDAOImpl"%>
<%@page import="dao.MemberDAO"%>
<%@page import="java.util.List"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>DBCP(JNDI 구현) TEST</h1>
<%
	MemberDAO dao = new MemberDAOImpl();
	List<Member> list = dao.selectAll();
	//out.println(list);
	
	for(Member m :list){
		out.print(m.getId() + " "+ m.getName() + "<br>");
	}
%>

</body>
</html>