<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="kr.co.shdudfo.vo.MemberVO" id="member" />
<jsp:setProperty name="member" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:getProperty property="email" name="member"/>
<%-- <%=member.getEmail() %> --%>
<jsp:getProperty property="nick" name="member"/>

</body>
</html>