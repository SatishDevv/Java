	<%@page import="jsp.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% Employee employee=(Employee)request.getAttribute("emp");%>
	<form action="edit" method="post">
		id:<input type="hidden" name="id" value=<%=employee.getId() %>>
		name:<input type="text" name="name" value=<%=employee.getName() %>> 
		phone:<input type="tel" name="phone" value=<%=employee.getPhone() %>>
		address:<input type="text" name="address" value=<%=employee.getAddress()%>>
		email:<input type="text" name="email" value=<%=employee.getEmail()%>>
		password:<input type="text" name="password" value=<%=employee.getPassword()%>>
		<button>edit</button>

	</form>

</body>
</html>