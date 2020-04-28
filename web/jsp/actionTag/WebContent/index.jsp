<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="kr.co.shdudfo.vo.MemberVO" %>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] names={"홍길동","이순신","심청이","에디슨"};
	pageContext.setAttribute("names", names);
%>
<c:forEach var="name" items="${names}" varStatus="stat">
<c:if test='${stat.first}'>
-------------------------<br>
</c:if>
${stat.first}:${stat.last} : ${stat.index}:${stat.count}:${name}<br>
<c:if test='${stat.last}'>
-------------------------<br>
</c:if>
</c:forEach>

<c:forEach var="number" begin="1" end="10" step="2" varStatus="stat">
	${number}
</c:forEach>
</body>
</html>	