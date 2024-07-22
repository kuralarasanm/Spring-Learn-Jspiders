<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h2>User Id:${u.getId() }</h2>
	<h2>User Name:${u.getName() }</h2>
	<h2>Email Id:${u.getEmail() }</h2>
	<h2>Phone Number:${u.getPhone() }</h2>
	<h2>Gender:${u.getGender() }</h2>
</body>
</html>