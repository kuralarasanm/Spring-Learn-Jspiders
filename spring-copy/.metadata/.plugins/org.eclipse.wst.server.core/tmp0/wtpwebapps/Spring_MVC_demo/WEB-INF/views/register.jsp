<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form register</title>
</head>
<body>
	<form:form modelAttribute="u" action="register">
		<form:label path="id">Id</form:label>
		<form:input path="id"/>
		<br>
		<form:label path="name">Name</form:label>
		<form:input path="name"/>
		<br>
		<form:label path="phone">phone number</form:label>
		<form:input path="phone"/>
		<br>
		<form:label path="gender">Gender</form:label>
		<form:radiobutton path="gender" value="male"/>male
		<form:radiobutton path="gender" value="female"/>female
		<br>
		<form:label path="age">age</form:label>
		<form:input path="age"/>
		<br>
		<form:label path="email" >Email</form:label>
		<form:input path="email"/>
		<br>
		<form:label path="password">password</form:label>
		<form:input path="password"/>
		<br>
		<form:button>Register</form:button>
	</form:form>
</body>
</html>