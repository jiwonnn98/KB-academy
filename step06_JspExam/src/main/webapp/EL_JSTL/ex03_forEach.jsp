<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="<%=application.getContextPath()%>/info">정보 가져오기</a>
<a href="${pageContext.request.contextPath }/info">정보 가져오기</a>
<hr>
<%--
	Product P = new Product();
--%>


<jsp:useBean id="p" class="jstl.Product"/>

<h3>상품 정보</h3>
<h4>
코드 : <%=p.getCode() %> / ${p.code}
이름 : ${p.name }
가격 : ${p.price } / <fmt:formatNumber value="${p.price }"/> <br>
수량 : ${p.qty }
</h4>
<hr>
<jsp:useBean id="bean" class="jstl.ForEachBean"/>


<c:forEach begin="1" end="10" var="1">안녕 </c:forEach><hr>

<fieldset>
<legend>이름선택</legend>
<c:forEach items="${bean.names}" var="name"  varStatus = "state">
	<input type="checkbox" name="name" value="${name}">
	${name}, ${state.index }, ${state.count }

</c:forEach>
</fieldset>

<fieldset>
<select name="menu">
<option value="0">--선택--</option>
<c:forEach items="${bean.menus }" var="menu">
<option name = "${menu}"> ${menu }</option>
</c:forEach>
</select>
</fieldset>


<table>
	<tr>
		<th>순서</th>
		<th>번호</th>
		<th>제목</th>
	</tr>
	<c:forEach items="${bean.boardList }" var="board" varStatus="state">
		<td></td>
		<td></td>
		<td></td>
	</c:forEach>
</table>


<fieldset>
	<legend>나라선택</legend>
	<c:forEach items="${bean.map }" var="nation">
		<input type="radio" name="nation" value="${nation.key }">	${nation.value }
		
	</c:forEach>
</fieldset>

</body>
</html>