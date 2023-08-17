<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="h" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공!</title>
<script src="jQuery"></script>

<script>
$(function(){
	$("a").click(function(){
		if(confirm("정말 로그아웃할래?")){
			//세션 정보를 모두 삭제
			location.href = "${pageContext.request.contextPath}/logout";
		}
	})
})
</script>

</head>
<body>
<c:choose>
 <c:when test="${sessionScope.sessionId!=null}">
   <h3>${sessionName}님 로그인 중[${sessionTime }]</h3><br>
   <img src="https://picsum.photos/200"><br>
   <a href="">로그아웃</a>
 </c:when>
 <c:otherwise>
  <script type="text/javascript">
    alert("shsh")
    location.href="${pageContext.request.contextPath}/LoginForm.jsp";
  </script>
 </c:otherwise>
</c:choose>


<h3><%=session.getAttribute("userName") %>님 로그인 중</h3><br>

<img src="https://picsum.photos/200"><br>

<form method="get" action="logout">
  
  <input type="submit" value="로그아웃" />
</form>
</body>
</html>