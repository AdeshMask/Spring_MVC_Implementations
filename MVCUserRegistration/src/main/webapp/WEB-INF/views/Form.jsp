<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
	
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">

<title>Hello</title>
</head>
<body>
	<%-- <img alt="my image" src='<c:url value="/resources/images/wallpaper.jpg" />'/> --%>
	<div className="form-content">
		<form className="form" action="home" method="post">
			<div className="form-head">
				<h2 className='text-center'>Registration Form</h2>
			</div>
			<div className="row-content">
				<label htmlFor="name" className="label text">Name</label> <input
					type="text" className="input" id="name" name="name" value=""
					placeholder="Your name.." />
				<error-output className="text-error" htmlFor="name"></error-output>
			</div>
			<div className="row-content">
				<label htmlFor="name" className="label text">Phone Number</label> <input
					type="text" className="input" id="phoneNumber" name="phoneNumber"
					value="" placeholder="mobile number...." />
				<error-output className="text-error" htmlFor="number"></error-output>
			</div>
			<div className="row-content">
				<label htmlFor="name" className="label text">UserName</label> <input
					type="text" className="input" id="userName" name="userName"
					value="" placeholder="userName.." />
				<error-output className="text-error" htmlFor="name"></error-output>
			</div>
			<div className="row-content">
				<label htmlFor="name" className="label text">Password</label> <input
					type="password" className="input" id="password" name="password"
					value="" placeholder="password.." />
				<error-output className="text-error" htmlFor="name"></error-output>
			</div>
			<div className="row-content">
				<label htmlFor="name" className="label text">Email-Id</label> <input
					type="email" className="input" id="email" name="email" value=""
					placeholder="Your email.."  />
				<error-output className="text-error" htmlFor="name"></error-output>
			</div>
			<br></br>
			<div className="submit-reset">
				<div className="buttonParent">
					<button size="large" type="submit" className="button submitButton"
						id="submitButton">Submit</Button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>