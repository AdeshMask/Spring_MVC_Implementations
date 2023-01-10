<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="<c:url value="/resources/css/Login.css"/>" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<form >
		<div class="form-group">
			<input type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>
		<div class="form-group">
			<input type="password" class="form-control"
				id="exampleInputPassword1">
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>