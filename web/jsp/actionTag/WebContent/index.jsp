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
<c:set var="kor" value="90" scope="page"/>
<c:set var="eng" value="100" scope="page"/>
<c:set var="math" value="93" scope="page"/>
<c:set var="avg" value="${(kor+eng+math) div 3}" scope="page"/>
<c:choose>
	<c:when test="${avg>90}">A</c:when>
	<c:when test="${avg>80}">B</c:when>
	<c:when test="${avg>70}">C</c:when>
</c:choose>

</body>
</html>	