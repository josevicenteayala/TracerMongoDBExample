<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
</head>
<body>

<spring:url value="/customer/add" var="addURL"></spring:url>
<a href="${addURL}">Add customer</a>

<h1>List Customer</h1>
<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Sex</th>
			<th>Identification</th>
			<th colspan="2">Action</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${listUser}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.first_name}</td>
			<td>${customer.last_name}</td>
			<td>${customer.gender}</td>
			<td>${customer.sex}</td>
			<td>${customer.identification}</td>
			<td>
				<spring:url value="/customer/update/${customer.id}" var="updateURL"></spring:url>
				<a href="${updateURL}">Update</a>
			</td>
			<td>
				<spring:url value="/customer/delete/${customer.id}" var="deleteURL"></spring:url>
				<a href="${deleteURL}">Delete</a>
			</td>			
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>