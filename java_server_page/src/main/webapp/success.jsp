<%@page import="jsp.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> list = (List) request.getAttribute("list");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Phone</th>
			<th>Address</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<%
		for (Employee employee : list) {
		%>
		<tr>

			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getPhone()%></td>
			<td><%=employee.getAddress()%></td>
			<td><%=employee.getEmail()%></td>
			<td><%=employee.getPassword()%></td>
			<td><a href="delete?id=<%=employee.getId()%>"><button>Delete</button></a></td>
			<td><a href="update?id=<%=employee.getId()%>"><button>Update</button></a></td>
			<%}%>
		</tr>

	</table>


</body>
</html>