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
<link rel="stylesheet"
	href="resources/bootstrapVendors/css/bootstrap.css">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="resources/resources/css/style.css">
<link rel="stylesheet" href="resources/resources/css/query-style.css">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400">
<title>Alpha Hr</title>
<link rel="icon" href="resources/resources/img/cv1.jpg">
</head>

<body>





	<div class="slider" id="main-slider">
		<!-- outermost container element -->

		<div class="slider-wrapper">
			<!-- innermost wrapper element -->
			<img src="resources/resources/img/cv1.jpg" alt="First" class="slide" />
			<img src="resources/resources/img/cv3.jpg" alt="Second" class="slide" />
			<img src="resources/resources/img/cv1.jpg" alt="Third" class="slide" />
		</div>


	</div>
	<%@include file="navbar.jsp"%>

	<div class="motto">
		<h1>
			Welcome!<br>Find The best Job!!!
		</h1>
	</div>

	<div class="row footer">

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

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="js/bootstrap.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script>
		(function() {

			function Slideshow(element) {
				this.el = document.querySelector(element);
				this.init();
			}

			Slideshow.prototype = {
				init : function() {
					this.wrapper = this.el.querySelector(".slider-wrapper");
					this.slides = this.el.querySelectorAll(".slide");
					this.previous = this.el.querySelector(".slider-previous");
					this.next = this.el.querySelector(".slider-next");
					this.index = 0;
					this.total = this.slides.length;
					this.timer = null;

					this.action();
					this.stopStart();
				},
				_slideTo : function(slide) {
					var currentSlide = this.slides[slide];
					currentSlide.style.opacity = 1;

					for (var i = 0; i < this.slides.length; i++) {
						var slide = this.slides[i];
						if (slide !== currentSlide) {
							slide.style.opacity = 0;
						}
					}
				},
				action : function() {
					var self = this;
					self.timer = setInterval(function() {
						self.index++;
						if (self.index == self.slides.length) {
							self.index = 0;
						}
						self._slideTo(self.index);

					}, 3000);
				},
				stopStart : function() {
					var self = this;
					self.el.addEventListener("mouseover", function() {
						clearInterval(self.timer);
						self.timer = null;

					}, false);
					self.el.addEventListener("mouseout", function() {
						self.action();

					}, false);
				}

			};

			document.addEventListener("DOMContentLoaded", function() {

				var slider = new Slideshow("#main-slider");
			});
		})();
	</script>
</body>


</html>