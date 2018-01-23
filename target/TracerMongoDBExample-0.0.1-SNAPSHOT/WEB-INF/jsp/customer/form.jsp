<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer</title>
</head>
<body>
<spring:url value="/customer/save" var="saveURL"></spring:url>

<form:form action="${saveURL}" modelAttribute="customerForm" method="POST">
	<label>ID: </label>
	<form:input path="id" readonly="true" ></form:input><br/>
	<label>First Name: </label>
	<form:input path="first_name"/><br/>
	<label>Last Name: </label>
	<form:input path="last_name"/><br/>
	<label>Gender: </label>
	<form:input path="gender"/><br/>
	<label>Sex: </label>
	<form:input path="sex"/><br/>
	<label>Identificattion: </label>
	<form:input path="identification"/><br/>
	<button type="submit">Save</button>
</form:form>


</body>
</html>