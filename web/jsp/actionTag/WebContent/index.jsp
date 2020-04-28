<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>

<jsp:forward page="forward.jsp">
	<jsp:param name="name" value='<%= URLEncoder.encode("홍길동","utf-8") %>'/>
</jsp:forward>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>	