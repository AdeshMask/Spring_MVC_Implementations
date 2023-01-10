<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<%@page isELIgnored="false"%>
<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div >
			<form action="new">
				<div class="form-group">
					<label>Name</label> <input type="name"
						class="form-control" id="name" name="name" placeholder="name">
				</div>
				<div class="form-group">
					<label>Contact</label> <input type="contact" class="form-control"
						id="contact" name="contact" placeholder="contact">
				</div>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>
