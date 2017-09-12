<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Gamma: Photo sharing APP</title>
<!--  vendors scc-->
<link rel="stylesheet" type="text/css"
	href="resources/vendors/css/normalize.css">
<link rel="stylesheet" type="text/css"
	href="resources/vendors/css/grid.css">
<link rel="stylesheet" type="text/css"
	href="resources/vendors/css/ionicons.min.css">
<link rel="stylesheet" type="text/css"
	href="resources/vendors/css/animate.css">


<!-- bootstrap vendors css-->
<link href="resources/bootstrapVendors/css/bootstrap.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">


<!-- Bootstrap core CSS -->

<link href="resources/resources/css/style.css" rel="stylesheet">
<link href="resources/resources/css/query-style.css" rel="stylesheet">
<link href="resources/resources/css/login.css" rel="stylesheet">

<link
	href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400"
	rel="stylesheet">
<title>Alpha Hr</title>
</head>

<body>

	<%@include file="navbar.jsp"%>


	<div class="middle">
		<!--middle-->
		<div class="login-logo">HR</div>
		<div class="login-title">Please login as :</div>
		<div class="login-buttons">
			<ul>
				<li><a href="#" class="employeeLogin-button"
					onclick="document.getElementById('id01').style.display='block'"><i
						class="ion-android-contact login-icons"></i>employee</a></li>
			</ul>

			<ul>
				<li><a href="#" class=" companyButton-button"
					onclick="document.getElementById('id02').style.display='block'"><i
						class="ion-android-people login-icons"></i>company</a></li>
			</ul>
		</div>



		<div>

			<div id="id01" class="modal employee">

				<form class="modal-content animate" action="Login" method="post">
					<div class="imgcontainer">
						<span
							onclick="document.getElementById('id01').style.display='none'"
							class="close" title="Close Modal">&times;</span> <i
							class="ion-android-contact avatar"></i>
						<!--                            <img src="img_avatar2.png" alt="Avatar" class="avatar">-->
					</div>

					<div class="container">
						<label>Username</label> <input type="text"
							placeholder="Enter Username " name="uname" required> <label><b>Password</b></label>
						<input type="password" placeholder="Enter Password" name="psw"
							required>

						<button type="submit">Login</button>
						<div class="remember">
							<input type="checkbox" checked="checked"> Remember me
						</div>
						<div class="regForg">
							<span class="register"><a href="EmployeeRegistration">Registration/</a></span>
							<span class="psw">Forgot <a href="#">password?</a></span>
						</div>
					</div>
				</form>
			</div>


			<div id="id02" class="modal company">

				<form class="modal-content animate"
					action="PersonalInfoOfCompany.html">
					<div class="imgcontainer">
						<span
							onclick="document.getElementById('id02').style.display='none'"
							class="close" title="Close Modal">&times;</span> <i
							class="ion-android-people avatar"></i>
						<!--                            <img src="img_avatar2.png" alt="Avatar" class="avatar">-->
					</div>

					<div class="container">
						<label>Company Name</label> <input type="text"
							placeholder="Enter Companyname" name="uname" required> <label><b>Password</b></label>
						<input type="password" placeholder="Enter Password" name="psw"
							required>

						<button type="submit" class="PopupLogin">Login</button>
						<div class="remember">
							<input type="checkbox" checked="checked"> Remember me
						</div>
						<div class="regForg">
							<span class="register"><a href="CompanyRegistration">Registration/</a></span>
							<span class="psw">Forgot <a href="#">password?</a></span>
						</div>
					</div>
				</form>
			</div>
		</div>


	</div>
	<!--End middle-->





	<div class="row footer footer-naw">
		<!--footer-->

		<div class="col-md-4 ">
			<ul class="footer-nav left-footer">
				<li><a href="#">Phone Number: +995 576345</a></li>
				<li><a href="#">Email:nino.makharadze.95@gmail.com</a></li>
			</ul>
		</div>

		<div class="col-md-4 footer-center">
			<p>Created By &copy; AlphaItUsa.com</p>
		</div>


		<div class="col-md-4 right-footer">
			<ul class="social-links ">
				<li><a href="#"><i class="ion-social-facebook"></i></a></li>
				<li><a href="#"><i class="ion-social-twitter"></i></a></li>
			</ul>
		</div>

	</div>
	<!--end footer-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="resources/resources/js/date.js">
		
	</script>

</body>
</html>

