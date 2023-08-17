<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>

<script type="text/javascript">
  $(function(){
	  $("#ajaxBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=text	", //통신할 서버의 주소
				type: "post",	//
				dataType: "text",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				data:"name=정지원" ,
				success: function(result, status){
					$("#display").html(result);
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
	  $("#jsonBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=json	", //통신할 서버의 주소
				type: "post",	//
				dataType: "json",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				//data:"name=정지원" ,
				success: function(result, status){
					//$("#display").html(result);
					let str ="";
					$.each(result, function(index, item){
						str+= "<input type='checkbox' name='menu', value='"+index+"'>" +item;
					})
					$("#display").html(str);
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
	  $("#dtoBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=dto	", //통신할 서버의 주소
				type: "post",	//
				dataType: "json",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				//data:"name=정지원" ,
				data:{id: "jiwon", name : "지원", addr: "jeju"},
				success: function(result, status){
					alert(result.id + "|" + result.name);
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
	  $("#listBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=list	", //통신할 서버의 주소
				type: "post",	//
				dataType: "json",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				//data:"name=정지원" ,
				//data:{id: "jiwon", name : "지원", addr: "jeju"},
				success: function(result, status){
					$.each(result, function(index, item){
						alert(item.id);
					})
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
	  $("#mapBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=map	", //통신할 서버의 주소
				type: "post",	//
				dataType: "json",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				//data:"name=정지원" ,
				//data:{id: "jiwon", name : "지원", addr: "jeju"},
				success: function(result, status){
					alert(result.pageNo);
					
					$.each(result.memberList , function(index, mem){
						alert(mem.id);
					})
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
	  $("#textJsonBtn").click(function(){
		  $.ajax({
				url: "${pageContext.request.contextPath}/ajax?key=property	", //통신할 서버의 주소
				type: "post",	//
				dataType: "json",	//서버가 보내오는 응답 ㄷ이터 타입 (text| html | json | xml)
				//data:"name=정지원" ,
				//data:{id: "jiwon", name : "지원", addr: "jeju"},
				data:{age:20},
				success: function(result, status){
					alert(result.info);
				},
				error:function(err, status){
					alert(err + " 발생했어요 status : " + status);
				}
			});
	  });
  })
</script>
</head>
<body>


<input type="button" value="text결과" id="ajaxBtn">
<input type="button" value="json결과" id="jsonBtn">

<input type="button" value="DTO결과" id="dtoBtn">
<input type="button" value="List결과" id="listBtn">
<input type="button" value="Map결과" id="mapBtn">

<input type="button" value="textJson결과" id="textJsonBtn">

<hr>
<div id="display"></div>



</body>
</html>













