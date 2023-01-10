<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- fetching data from View to Controller by using JSP expression -->
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form class="text-center">
		<h1 class="text-center">${Header}</h1>
		<hr>
		<h2>Welcome ${user.userName}</h2>
		<h2>Your email id is ${user.email }</h2>
		<h3>and Your password is ${user.password }</h3>
	</form>

</body>
</html>