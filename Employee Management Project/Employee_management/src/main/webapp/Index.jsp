<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="False"%>

<html>
<head>

<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<%@ include file="CSS/Admin_login.jsp"%>
<%@ include file="CSS/Links.jsp"%>
<!------ Include the above in your HEAD tag ---------->


<style>
.extra-small-font {
	font-size: 1rem; /* Adjust the size as needed */
}
</style>
</head>
<body id="LoginForm">




	<div class="container p-5">

		<div class="login-form">

			<div class="main-div">

				<div class="panel">
					<h2>Admin Login</h2>
					<p>Please enter your email and password</p>
				</div>




				<c:if test="${not empty errorMsg }">
					<p class="text-center text-danger fs-3">${errorMsg}</p>
					<c:remove var="errorMsg" scope="session" />
				</c:if>

				<c:if test="${not empty sucMsg}">
					<p class="text-center text-danger extra-small-font">${sucMsg}</p>
					<c:remove var="sucMsg" scope="session" />
				</c:if>

				<form action="login" method="post">

					<div class="form-group">

						<div class="input-group">
							<div class="input-group-append">
								<span class="input-group-text"><i
									class="fa-solid fa-user"></i></span>
							</div>
							<input type="email" class="form-control" name="email"
								placeholder="Email Address">

						</div>

					</div>




					<div class="form-group">


						<div class="input-group">
							<div class="input-group-append">
								<span class="input-group-text"><i
									class="fa-solid fa-lock"></i></span>
							</div>

							<input type="password" class="form-control" name="password"
								placeholder="Password">


						</div>



					</div>


					<br> <br>

					<button type="submit" class="btn btn-outline-light  btn-lg"
						id="myButton">
						Submit <i class="fa-solid fa-arrow-right myButton"></i>
					</button>
					<br> <br> <a href="User_login.jsp"><i
						class="fa-solid fa-arrow-left"></i> Back to User Login </a>
				</form>
			</div>

		</div>
	</div>



</body>
</html>
