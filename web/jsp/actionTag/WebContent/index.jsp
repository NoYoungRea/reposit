<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="kr.co.shdudfo.vo.MemberVO" %>
<%
	MemberVO member=new MemberVO();
	member.setEmail("shdudfo");
	member.setNick("sh");
%>
<%-- <jsp:useBean id="member" class="kr.co.shdudfo.vo.MemberVO"></jsp:useBean> --%>
<%-- <jsp:setProperty name="member" property="email" value="shdudfo"/> --%>
<%-- <jsp:setProperty name="member" property="nick" value="sh"/> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${member.nick}
${member["nick"]}
</body>
</html>	