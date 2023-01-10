<html>
<body>
	<h2>Hello Adesh!</h2>
	<h1>This is my first Spring MVC project</h1>

	<%
	String name = (String) request.getAttribute("name");
	Integer Id = (Integer) request.getAttribute("id");
	/* List<String> list = (List<String>)request.getAttribute("f");  */
	%>

	<h1>
		My name is
		<%=name%></h1>
	<h2>
		My ID is
		<%=Id%>
	</h2>
</body>
</html>