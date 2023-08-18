<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>servlet요청</h1>
<form action="encResult" method="post">
이름 : <input type = "text" name="name">
<input type = "submit" value="전송">
</form>

<h1>jsp요청</h1>
<form action="encodingResult.jsp" method="post">
이름 : <input type = "text" name="name">
<input type = "submit" value="전송">
</form>
</body>
</html>