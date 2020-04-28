<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
int a=Integer.parseInt(request.getParameter("A"));
int b=Integer.parseInt(request.getParameter("B"));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${param.A+param.B}

</body>
</html>