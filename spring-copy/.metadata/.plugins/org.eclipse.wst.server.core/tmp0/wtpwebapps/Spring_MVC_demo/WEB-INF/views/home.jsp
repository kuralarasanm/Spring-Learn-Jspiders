<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home page</title>
<style type="">
h2 {
	background-color: darkgreen;
	color: silver;
	text-align: center;
}

h3 {
	margin-left: 37%;
	margin-top: 30px;
}
</style>
</head>
<body>
	<h2>welcome to home page of spring-mvc-demo Mr.${user}</h2>
	<h3>1.
		<a href="open-view?view=sum">click here to find the sum of 2 numbers</a>
	</h3>
	<h3>2.
		<a href="open-view?view=subtract">click here to find the subtract of 2
			numbers</a>
	</h3>
	<h3>3.
		<a href="open-view?view=multiple">click here to find the multiple of 2
			numbers</a>
	</h3>
	<h3>4.
		<a href="open-view?view=divide">click here to find the divide of 2 numbers</a>
	</h3>
	<h3>5.
		<a href="open-register">click here to register form</a>
	</h3>
</body>
</html>