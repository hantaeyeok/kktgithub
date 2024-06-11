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
    <title>${yyyymm}에 속해 있는 달의 국경일</title>
</head>
<body>
    <nav>
        <a href="home">HOME</a>
        <a href="cal1?yyyy=2023">2023년 전체 국경일</a>
        <a href="cal2?sunDate=2023-10-01">2023년 10월의 국경일</a>
        <a href="cal3?yyyymm=202310">2023년 10월의 달력</a>
    </nav>
    <ul>
    <c:forEach items="${holiList}" var="holi">
        <li>${holi.dateName} : ${holi.locdate}</li>
    </c:forEach>
    </ul>
</body>
</html>
