<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("Id");
	%>

	<h1>
		My name is
		<%=name%>
		and my ID is
		<%=id%>
	</h1>
	
	<!-- Fetching Data by using jsp expression -->
	
	<h2>Hello ${friend} This is my ID ${id}</h2>
	<h2>numbers ${numbers} </h2>
	<hr>
	<h2>
	<c:forEach var="item" items="${numbers}">
	<!-- ${item } -->	
	<!-- another way -->
	<c:out value="${item }" ></c:out>
	</c:forEach>
	</h2>
</body>
</html>