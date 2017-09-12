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
<link rel="stylesheet" type="text/css" href="resources/vendors/css/normalize.css">
<link rel="stylesheet" type="text/css" href="resources/vendors/css/grid.css">
<link rel="stylesheet" type="text/css"
	href="resources/vendors/css/ionicons.min.css">
<link rel="stylesheet" type="text/css" href="resources/vendors/css/animate.css">


<!-- bootstrap vendors css-->
<link href="resources/bootstrapVendors/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">


<!-- Bootstrap core CSS -->

<link href="resources/resources/css/style.css" rel="stylesheet">
<link href="resources/resources/css/query-style.css" rel="stylesheet">
<link href="resources/resources/css/register.css" rel="stylesheet">

<link
	href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400"
	rel="stylesheet">
<title>Alpha Hr</title>
</head>

<body>

	<%@include file="navbar.jsp"%>
	
	<div class="middle">
		<!--middle-->
		<div class="login-logo">
			<i class="ion-android-people"></i>
		</div>
		<div class="login-title">registration company</div>

		<div>

			<form action="">
				<div class="container">
					<div class="col-md-6">
						<label>Company Name <span> * </span></label> <input type="text"
							placeholder="Enter NaCompany Nameme" name="companyName" required>
					</div>

					<div class="col-md-6">
						<label>Identification Number <span> * </span></label> <input
							type="text" placeholder="Enter Identification Number"
							name="IdentificationNamber" required>
					</div>


					<div class="col-md-6">
						<label>Phone Number <span> * </span>
						</label> <input type="text" placeholder="Enter Phone Number"
							name="phoneNumber" required>
					</div>


					<div class="col-md-6">
						<label>Email <span>* </span>
						</label> <input type="text" placeholder="Enter Email" name="email"
							required>
					</div>


					<div class="col-md-6">
						<label>Password <span>* </span>
						</label> <input type="password" placeholder="Enter Password" name="psw"
							required>
					</div>

					<div class="col-md-6">
						<label>Repeat Password <span> * </span></label> <input
							type="password" placeholder="Repeat Password" name="psw-repeat"
							required>
					</div>

					<div class="col-md-12">
						<button type="submit"
							onclick="document.getElementById('companyPopup').style.display='block'"
							class="PopupLogin">Register Company</button>
					</div>

				</div>


			</form>

		</div>


		<div id="companyPopup" class="modal employee">

			<form class="modal-content animate" action="login.html">
				<div class="imgcontainer">
					<span
						onclick="document.getElementById('companyPopup').style.display='none'"
						class="close" title="Close Modal">&times;</span> <i
						class="ion-android-contact avatar"></i>
				</div>

				<div class="container">

					<i class="ion-checkmark succesIcone"></i>
					<p class="alarmText">
						Information sent succesful <br> please chek your Email
					</p>

					<button type="submit">Login</button>

				</div>
			</form>
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

</body>
</html>

