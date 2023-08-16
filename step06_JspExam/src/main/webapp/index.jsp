<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> JSP 문법 TEST</h1>
<%
	//여기는 jsp 영역입니다.
	String name = "정지원";
	int age = 29;
%>
<%!
	String message = "점심메뉴는?";
	public String test(){
			System.out.println("test()메소드 호출됨");
			
			return message + "맛있는거 먹어요!";
	}
%>

<h3> 
	이름 : <%=name %><br>
	나이 : <%=age %><br>
	메소드 호출 : <%=this.test() %>
</h3>

</body>
</html>