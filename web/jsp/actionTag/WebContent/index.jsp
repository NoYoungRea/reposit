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
<c:set var="member" value="<%=new kr.co.shdudfo.vo.MemberVO() %>" scope="page"/>
<c:set target="${member}" property="email" value="shdudfo"/>
<c:set target="${member}" property="nick" value="wjdalwk"/>
<%
	MemberVO member=(MemberVO)pageContext.getAttribute("member");
%>
액션 태그 : <%=member.getEmail().equals("shdudfo")%><br>
EL 표현: ${member.email=="shdudfo"}<br/>
</html>	