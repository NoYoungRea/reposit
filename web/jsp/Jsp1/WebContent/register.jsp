<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="bin.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Member m = (Member)request.getAttribute("member");
	out.println(m.getEmail()+"\n");
	out.println(m.getNick()+"\n");
	out.println(m.getRegdate()+"\n"	);
	
%>
</body>
</html>