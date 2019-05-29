<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Spring 3 MVC Multipe Row Submit - viralpatel.net</title>
</head>
<body>
	
<h2>All employee</h2>

	<table>
		<tr>
			<th>Id</th>
			<th>First name</th>
			<th>Last name</th>
			<th>Birth date</th>
			<th>Email</th>
			<th>Password</th>
			<th>Department</th>
			<th>Role</th>
		</tr>

		<c:forEach items="${empList}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.id}</td>
				<td>${employee.id}</td>
				<td>${empList}</td>
				<td>${empList}</td>
				<td>${empList}</td>
				<td>${empList}</td>
				<td><a href="/delete-user?id=${user.id}">DELETE<span
						class="glyphicon glyphicon-trash"></span></a></td>
				<td><a href="/edit-user?id=${user.id}">EDIT<span
						class="glyphicon glyphicon-pencil"></span></a></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>