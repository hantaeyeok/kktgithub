<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.servletContext.contextPath }" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RestfulAPI JSON Test Insert</title>
    <script src="https://code.jquery.com/jquery-latest.js"></script>
</head>
<body>
<div>
    연번 : <input type="text" name="num" id="num" required><br>
    제목 : <input type="text" name="title" id="title" required><br>
    <input type="button" id="btn1" value="등록" />
</div>
<script>
    $(document).ready(function(){
        $("#btn1").click(function(){
            var test = { "num":$("#num").val(), "title":$("#title").val() };
            $.ajax({
                type:"post",
                url:"${path1}/json/insertForm2", //@RequestBody로 받는 경우
                data:JSON.stringify(test),  //json 객체로 변환하여 전송
                dataType:"json",
                contentType : "application/json; charset=utf-8",
                success: function(t){ console.log("성공", t); },
                error:function(err){ console.log("실패", err); }
            });
        });
    });
</script>
</body>
</html>
