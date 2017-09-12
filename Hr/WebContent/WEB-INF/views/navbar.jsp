<nav class="nav-bar">
	<div class="row">
		<div class="right-menu">
			<a href="#"> <span class="hr">HR</span>
			</a>
		</div>


		<div class="left-menu">
			<ul class="main-nav js--main-nav">
				<li><a href="Home">home</a></li>
				<li><a href="About">about us </a></li>
				<li><a href="Candidates">candidates</a></li>
				<li><a href="Contact">contact us</a></li>
				<%
					if (session.getAttribute("id") == null) {
				%>
				<li><a href="Login" style="color: aqua">Sign up</a></li>
				<%
					} else {
				%>
				<li><a href="Logout" style="color: aqua">Logout</a></li>
				<li><a href="PersonalInfoOfCandidate" style="color: aqua;bacground-color:white;border-radius:50%;">profile</a></li>
				<%
					}
				%>
			</ul>
		</div>
	</div>
</nav>