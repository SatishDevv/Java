<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%String message=(String) request.getAttribute("message");
if(message != null){
	
%>
<h2> <%=message%></h2>
<%	
}
%>


<form action="login" method="post">
email:<input type="text" name="email">
password:<input type="text" name="password">
<button>Login</button>

</form>

</body>
</html>