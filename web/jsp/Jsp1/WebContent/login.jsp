<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bin.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="./js/jquery-3.5.0.min.js"></script>
<script>
$('document').ready(function(){
	$('#button1').click(function(){
<%! public void clickButton1(PageContext pc){
// 	(HttpServletResponse)(pc.getResponse()).
}

%>
		location.href="a.html"
	})
})
</script>
</head>
<body>
<%
	
	Member m=(Member)session.getAttribute("member");
	if(m==null){
%>
<form method="post" action="login">
	메일주소<input type="text" name="email" size="50"><br>
	비밀번호<input type="password" name="password" size="50"><br>
	<button type="submit">로그인</button>
</form>
	<button id="button1" type="button">회원가입</button>


<%
	}
	else{

out.println("메일주소 : "+m.getEmail());
out.println("별명 : "+m.getNick());
session.invalidate();
	}
%>
</body>
</html>