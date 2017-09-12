<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" >
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Gamma: Photo sharing APP</title>
        <!--  vendors scc-->
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/normalize.css">
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/grid.css">
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/ionicons.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/animate.css">


        <!-- bootstrap vendors css-->
        <link href="resources/bootstrapVendors/css/bootstrap.css" rel="stylesheet">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">


        <!-- Bootstrap core CSS -->

        <link href="resources/resources/css/style.css" rel="stylesheet">
        <link href="resources/resources/css/query-style.css">
        <link href="resources/resources/css/register.css" rel="stylesheet">
        <link href="resources/resources/css/about.css" rel="stylesheet">
        <link href="resources/resources/css/PersonalInfoOfCandidates.css" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400" rel="stylesheet">
        <title>Alpha Hr</title>
    </head>

    <body>

        <%@include  file="navbar.jsp" %>

        <div class="middle"> <!--middle-->

            <div class="row titleAbout">

                <h1>personal information</h1>
            </div>




            <div class="personDescription">



                <div class="privateDescription">
                    <div class="col-md-12">

                        <div class="col-md-2 ">
                            <img  class="candidatesImg" src="resources/resources/img/cand3.jpg">
                        </div>

                        <div class="col-md-10">
                            <div class="col-md-10 fullName">
                                <div class="col-md-4"><b>Name:</b><span>Nino</span> </div>
                                <div class="col-md-4"><b>Email:</b> <span>Makharadze</span></div>
                                <div class="col-md-4"><b>Profesion:</b><span>Programer</span></div>

                                <div class="col-md-4"><b>Last Name:</b><span>Makharadze</span></div>
                                <div class="col-md-4"><b>Phone Number:</b><span>+995595923974</span></div>
                                <div class="col-md-4"><b>Experience:</b> <span>2-years</span></div>
                                
                                
                                  <div class="col-md-4"><b>Nationality:</b><span>Georgian</span></div>
                                <div class="col-md-4"><b>Gender:</b><span>Female</span></div>
                                <div class="col-md-4"><b>Date of birth:</b> <span>13/10/1995</span></div>
                            </div>

                        </div>

                    </div>
                    
                    <div class="personalCV">
                        <a href="AddCv">Create new CV</a>
                        <a href="#">View your CV</a>
                    
                    </div>
                    
                    


                </div>



            </div>
            



        </div> <!--End middle-->
        
        








        <div class="row footer">

            <div class="col-md-4 ">
                <ul class="footer-nav left-footer">
                    <li><a href="#">Phone Number:   +995 576345</a></li>
                    <li><a href="#">Email:nino.makharadze.95@gmail.com</a></li>
                </ul>
            </div>

            <div class="col-md-4 footer-center">
                <p>
                    Created  By &copy; AlphaItUsa.com 
                </p>
            </div>


            <div class="col-md-4 right-footer">
                <ul class="social-links ">
                    <li><a href="#"><i class="ion-social-facebook"></i></a></li>
                    <li><a href="#"><i class="ion-social-twitter"></i></a></li>
                </ul>
            </div>

        </div>










        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


    </body>
</html>