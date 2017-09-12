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
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/ionicons.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendors/css/animate.css">
        <!-- bootstrap vendors css-->
        <link href="resources/bootstrapVendors/css/bootstrap.css" rel="stylesheet">
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">


        <!-- Bootstrap core CSS -->

        <link href="resources/resources/css/cv.css" rel="stylesheet">

        <link href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400" rel="stylesheet">
        <title>Alpha Hr</title>
    </head>

    <body>
    <%@include  file="navbar.jsp" %>
    
    
        <div class="container">
            <form action="AddCv" method="post">
                <header>
                    <div class="header-box">
                        <h1 class="header-title">My CV</h1>
                        <a href="#"><i class="glyphicon glyphicon-pencil header-icon"></i></a>
                    </div>


                </header>

                <section class="info">
                    <div class="info-box">
                        <div class="info-header ">
                            <ul>
                                <li>
                                    <a><i class="glyphicon glyphicon-user info-icone"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="glyphicon glyphicon-chevron-down info-icone"></i></a>
                                </li>
                            </ul>

                            <div class="info-title">
                                <span class="">Personal Info</span>
                                <a href="#"><i class="glyphicon glyphicon-pencil "></i></a>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-md-3 ">
                                <div class="upload-photo-section">
                                    <div class="personal-info-uploadPhoto pfPhoto"  id="pf_foto" name="pfPhoto">
                                        <div id="pf-foto-hidden">
                                            <i class="ion-ios-cloud-upload-outline "></i>
                                            <span>Please log in <br> to upload an avatar</span>
                                        </div>
                                    </div>

                                    <input id="verborgen_file" type="file" name="cv_photo"/>
                                    <input type="button" class="btn btn-primary upload-button" id="uploadButton" value="Upload File"/>

                                </div>

                            </div><!---end md3-->


                            <div class="col-md-9 right-section">
                                <div class="info-inputs">

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <label for="usr">First Name:</label>
                                            <input type="text" class="form-control userName" id="usr" name="userName">
                                        </div>

                                        <div class="col-md-6">
                                            <label for="last-nam">Last Name:</label>
                                            <input type="text" class="form-control last-nam" id="last-nam" name="last-name">
                                        </div>
                                    </div>

                                    <div class="col-md-12">


                                        <div class="col-md-6">
                                            <label for="datepicker">Date of birth:</label>
                                            <div>
                                                <input type="text"  class="form-control datepicker" id="datepicker" placeholder="mm/dd/yy" name="datepicker">
                                                <span class="input-group-addon">
                                                    <i class="glyphicon glyphicon-calendar"></i>
                                                </span>
                                            </div>
                                        </div>



                                        <div class="col-md-6">
                                            <label for="target">Nationality:</label>
                                            <br>
                                            <select class="target nationality"  name="nationality">
                                                <option value="American">American</option>
                                                <option value="Georgian">Georgian</option>
                                                <option value="Russian Federation">Russian Federation</option>
                                            </select>

                                        </div>
                                    </div>

                                    <div class="col-md-12">

                                        <div class="col-md-4">
                                            <label for="phone">Phone Number:</label>
                                            <input type="number" min="0" class="form-control phoneNumber" id="phone" name="phoneNumber">
                                        </div>

                                        <div class="col-md-4">
                                            <label for="mail">Email addres:</label>
                                            <input type="text" class="form-control email" id="mail" name="email">
                                        </div>

                                        <div class="col-md-4">
                                            <label for="gender">Gender:</label>
                                            <br>
                                            <select id="gender" class="target gender" name="gender">
                                                <option value="Female">Female</option>
                                                <option value="Male">Male</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="col-md-12">

                                        <div class="col-md-4">
                                            <label for="driving license">Driving license:</label>
                                            <br>
                                            <select id="driving-license" class="target driving-license" name="driving-license">
                                                <option value="1">Yes</option>
                                                <option value="0">No</option>
                                            </select>
                                        </div>

                                        <div class="col-md-offset-1 col-md-3">
                                            <label for="slary-from">salary from:</label>
                                            <input type="number" min="0" class="form-control salary-from" id="salary-from" name="salaryFrom">
                                        </div>
                                        <div class="col-md-1  " >
                                            <br>

                                            <p class="space-salary">----</p>
                                        </div>

                                        <div class="col-md-3">
                                            <label for="slary-to"> salary to:</label>
                                            <input type="number" min="0" class="form-control salary-to" id="salaryTo" name="salary-to">
                                        </div>

                                    </div>

                                    <div class="col-md-12">
                                        <div class="col-md-12">
                                            <label>Address</label>
                                        </div>
                                        <div class="col-md-6">
                                            <input type="text" class="form-control street" placeholder="Street, number" id="street" name="street">
                                        </div>
                                        <div class="col-md-6">
                                            <input type="text" class="form-control city" id="city" placeholder="City" name="city">
                                        </div>

                                    </div>

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <input type="text" class="form-control postal-code" id="postal-code" placeholder="Postal code" name="postal-code">
                                        </div>
                                        <div class="col-md-6">

                                            <select id="country" class="target country" name="country">
                                                <option value="Russian Federation">Russian Federation</option>
                                                <option value="American">American</option>
                                            </select>
                                        </div>

                                    </div>

                                    <div class="col-md-12">
                                        <div class="col-md-3">
                                            <label for="txtedit">Profile:</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12 text-editor">
                                        <textarea name="area1" cols="40" id="pf-description"></textarea>
                                    </div>


                                </div><!---end personal info inputs---->
                            </div><!----end md-9---->
                        </div><!---end row---->
                    </div>  <!--end personal info box-->

                </section>





                <!--work eqperience-->

                <section class="info work-info">
                    <div class="info-box ">
                        <div class="info-header">
                            <ul>
                                <li>
                                    <a><i class="glyphicon glyphicon-briefcase info-icone"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="glyphicon glyphicon-chevron-down info-icone"></i></a>
                                </li>
                            </ul>

                            <div class="info-title">
                                <span class="">Work experience</span>
                                <a href="#"><i class="glyphicon glyphicon-pencil "></i></a>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-md-3 ">
                                <div class="work-left-section">
                                    <div class="number-category">
                                        <table class="category work-cate" >
                                            <tr>
                                                <td><button class="chouse-number">
                                                    Chouse number #<span>1</span>
                                                    <i class="ion-navicon">
                                                    </i>
                                                    </button>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>

                                <div class="button-bottom" >
                                    <button type="button" id="work-button" class="btn btn-primary  add-button work-button"><i class="ion-plus-round"></i> Add new </button>
                                </div>

                            </div><!---end md3-->



                            <div class="col-md-9 right-section">
                                <div class="info-inputs">

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <label for="company-name">Company Name:</label>
                                            <input type="text" class="form-control company-name" id="company-name" name="company-namer">
                                        </div>

                                        <div class="col-md-6">
                                            <label for="job-title">Job title:</label>
                                            <input type="text" class="form-control job-title" id="job-title" name="job-title">
                                        </div>
                                    </div>

                                    <div class="col-md-12">


                                        <div class="col-md-6">
                                            <label for="target">Country:</label>
                                            <br>
                                            <select class="target workCountry">
                                                <option value="America">America</option>
                                                <option value="Georgia">Georgia</option>
                                                <option value="Russia">Russia</option>
                                            </select>

                                        </div>

                                        <div class="col-md-6">
                                            <label for="city">City:</label>
                                            <div>
                                                <input type="text"  class="form-control workCity" id="city" name="city">

                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-md-12">


                                        <div class="col-md-3">
                                            <label for="target">Time period:</label>
                                        </div>

                                    </div>



                                    <div class="col-md-12">
                                        <div class="col-md-3">
                                            <select class="target workStartYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>
                                        </div>
                                        <div class="col-md-2" >
                                            <select class="target workStartMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-2 ">
                                            <p class="space-time-period">-</p>

                                        </div>


                                        <div class="col-md-2  " >
                                            <select class="target workEndMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-3 ">
                                            <select class="target workEndYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>

                                        </div>

                                    </div>


                                    <div class="col-md-12">
                                        <div class="col-md-5">
                                            <br>
                                            <label for="txtedit"> About Experience:</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12 text-editor">
                                        <textarea  class="txtedit about-experience" id="about-experience"  name="txtedit"></textarea>
                                    </div>





                                </div><!---end work-info inputs---->
                            </div><!----end md-9---->

                        </div><!---end row---->
                    </div>  <!--end work info box-->

                </section>





                <!--education-->

                <section class="info education ">
                    <div class="info-box ">
                        <div class="info-header">
                            <ul>
                                <li>
                                    <a><i class="glyphicon glyphicon-education info-icone"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="glyphicon glyphicon-chevron-down info-icone"></i></a>
                                </li>
                            </ul>

                            <div class="info-title">
                                <span class="">Education </span>
                                <a href="#"><i class="glyphicon glyphicon-pencil "></i></a>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-md-3">
                                <div class="education-left-section">
                                    <div class="number-category">
                                        <table class="category education-cate" >
                                            <tr>
                                                <td><button class="chouse-number">
                                                    Chouse number #<span>1</span>
                                                    <i class="ion-navicon">
                                                    </i>
                                                    </button>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>


                                <div class="button-bottom" >
                                    <button type="button" class="btn btn-primary  add-button education-button"><i class="ion-plus-round"></i> Add new </button>
                                </div>


                            </div><!---end md3-->




                            <div class="col-md-9 right-section">
                                <div class="info-inputs">

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <label for="institute-name">Institution name:</label>
                                            <input type="text" class="form-control institute-name" id="institute-name" name="institute-namer">
                                        </div>

                                        <div class="col-md-6">
                                            <label for="target">Degree:</label>
                                            <br>
                                            <select class="target degree">
                                                <option value="Pupel">Pupel</option>
                                                <option value="Bachelor">Bachelor</option>
                                            </select>

                                        </div>
                                    </div>

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <label for="institute-name">Faculty:</label>
                                            <input type="text" class="form-control faculty" id="institute-name" name="institute-namer">
                                        </div>
                                        <div class="col-md-6">
                                            <label for="profession">Profession:</label>
                                            <input type="text" class="form-control profession" id="profession" name="profession">
                                        </div>

                                    </div>



                                    <div class="col-md-12">


                                        <div class="col-md-6">
                                            <label for="target">Country:</label>
                                            <br>
                                            <select class="target educationCountry" name="education-country">
                                                <option value="America">America</option>
                                                <option value="Georgia">Georgia</option>
                                                <option value="Russia">Russia</option>
                                            </select>

                                        </div>

                                        <div class="col-md-6">
                                            <label for="educationCity">City:</label>
                                            <div>
                                                <input type="text"  class="form-control educationCity" id="educationCity" name="educationCity">

                                            </div>
                                        </div>
                                    </div>


                                    <div class="col-md-12">


                                        <div class="col-md-3">
                                            <label for="target">Time period:</label>
                                        </div>

                                    </div>



                                    <div class="col-md-12">
                                        <div class="col-md-3">
                                            <select class="target educationStartTimeYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>
                                        </div>
                                        <div class="col-md-2" >
                                            <select class="target educationStartTimeMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-2  " >
                                            <p class="space-time-period">-</p>

                                        </div>


                                        <div class="col-md-2  " >
                                            <select class="target educationEndTimeMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-3 ">
                                            <select class="target educationEndTimeYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>

                                        </div>

                                    </div>


                                    <div class="col-md-12">
                                        <div class="col-md-5">
                                            <br>
                                            <label for="txtedit">About Education:</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12 text-editor">
                                        <textarea  class="txtedit aboutEducation" id="aboutEducation" name="txtedit"></textarea>
                                    </div>





                                </div><!---end education-info inputs---->
                            </div><!----end md-9---->
                        </div><!---end row---->
                    </div>  <!--end education info box-->

                </section>





                <!--certification eqperience-->

                <section class="info certification-info">
                    <div class="info-box ">
                        <div class="info-header">
                            <ul>
                                <li>
                                    <a><i class="ion-ribbon-b info-icone"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="glyphicon glyphicon-chevron-down info-icone"></i></a>
                                </li>
                            </ul>

                            <div class="info-title">
                                <span class="">Certification</span>
                                <a href="#"><i class="glyphicon glyphicon-pencil "></i></a>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-md-3 ">
                                <div class="certification-left-section">
                                    <div class="number-category">
                                        <table class="category certification-cate" >
                                            <tr>
                                                <td>
                                                    <button class="chouse-number">
                                                        Chouse number #<span>1</span>
                                                        <i class="ion-navicon">
                                                        </i>
                                                    </button>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>

                                <div class="button-bottom" >
                                    <button type="button" class="btn btn-primary  add-button certification-button"><i class="ion-plus-round"></i> Add new </button>
                                </div>

                            </div><!---end md3-->


                            <div class="col-md-9 right-section">
                                <div class="info-inputs">

                                    <div class="col-md-12">
                                        <div class="col-md-8">
                                            <label for="certification-name">Certification Name:</label>
                                            <input type="text" class="form-control certification-name" id="certification-name" name="certification-name">
                                        </div>
                                    </div>


                                    <div class="col-md-12">
                                        <div class="col-md-3">
                                            <label for="target">Time period:</label>
                                        </div>
                                    </div>



                                    <div class="col-md-12">
                                        <div class="col-md-3">
                                            <select class="target certification-startTimeYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>
                                        </div>
                                        <div class="col-md-2" >
                                            <select class="target certification-startTimeMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-2  " >
                                            <p class="space-time-period">-</p>

                                        </div>


                                        <div class="col-md-2  " >
                                            <select class="target certification-endTimeMonth">
                                                <option value="1">1</option>
                                                <option value="2">2</option>
                                                <option value="3">3</option>
                                            </select>

                                        </div>

                                        <div class="col-md-3 ">
                                            <select class="target certification-endTimeYear">
                                                <option value="2017">2017</option>
                                                <option value="2016">2016</option>
                                                <option value="2015">2015</option>
                                            </select>

                                        </div>

                                    </div>


                                    <div class="col-md-12">
                                        <div class="col-md-5">
                                            <br>
                                            <label for="txtedit">About Certification:</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12 text-editor">
                                        <textarea  class="txtedit aboutCertification" id="aboutCertification" name="txtedit"></textarea>
                                    </div>

                                </div><!---end certification inputs---->
                            </div><!----end md-9---->

                        </div><!---end row---->
                    </div>  <!--end certification-->

                </section>





                <!--skils-->

                <section class="info skils">
                    <div class="info-box ">
                        <div class="info-header">
                            <ul>
                                <li>
                                    <a><i class="ion-erlenmeyer-flask info-icone"></i></a>
                                </li>
                                <li>
                                    <a href="#"><i class="glyphicon glyphicon-chevron-down info-icone"></i></a>
                                </li>
                            </ul>

                            <div class="info-title">
                                <span class="">Skills </span>
                                <a href="#"><i class="glyphicon glyphicon-pencil "></i></a>
                            </div>
                        </div>


                        <div class="row">
                            <div class="col-md-3">
                                <div class=" skill-left-section">
                                    <div class="number-category">
                                        <table class="category skill-cate" >
                                            <tr>
                                                <td><button class="chouse-number">
                                                    Chouse number #<span>1</span>
                                                    <i class="ion-navicon">
                                                    </i>
                                                    </button>
                                                </td>
                                            </tr>
                                        </table>
                                    </div>
                                </div>


                                <div class="button-bottom" >
                                    <button type="button" class="btn btn-primary  add-button skill-button"><i class="ion-plus-round"></i> Add new </button>

                                </div>


                                <div class="new-categoty"></div>


                            </div><!---end md3-->


                            <div class="col-md-9 right-section">
                                <div class="info-inputs">

                                    <div class="col-md-12">
                                        <div class="col-md-6">
                                            <label for="skill-category">Skill category name:</label>
                                            <input type="text" class="form-control skillCategoryName" placeholder="e.g Languages" id="skill-category" name="skill-category">
                                        </div>

                                    </div>


                                    <div class="added-skill">
                                        <div class="col-md-12">
                                            <div class="col-md-6">
                                                <label for="skill-name">Skill name:</label>
                                                <input type="text" class="form-control skillName" placeholder="e.g English" id="skill-category" name="skill-name">
                                            </div>

                                            <div class="col-md-3">
                                                <label for="target">Skill level:</label>
                                                <br>
                                                <select class="target skillLevel">
                                                    <option value="Elementary">Elementary</option>
                                                    <option value="Limited">Limited</option>
                                                    <option value="Professional">Professional</option>
                                                    <option value="Full">Full</option>
                                                    <option value="Native">Native</option>

                                                </select>
                                            </div>


                                        </div>


                                    </div>

                                    <div class="col-md-12">

                                        <div class="col-md-6">
                                            <button type="button" class="btn btn-primary  add-new-skill">
                                                <i class="ion-plus-round"></i>ADD NEW SKILL
                                            </button>
                                        </div>



                                    </div>
                                </div>
                            </div><!----end md-9---->

                        </div><!---end row---->
                    </div>  <!--end skill info box-->
                </section>

                <input id="jObject" type="hidden"  name="jObject">

                <section class="send" id="send">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="col-md-offset-5">
                                <input id="sendInfo" type="submit" value="Submit" class="btn btn-primary upload-button " name="submit">
                            </div>
                        </div>
                    </div>
                </section>
            </form>
        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script src="resources/bootstrapVendors/js/bootstrap.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="resources/vendors/js/nicEdit.js"></script>
        <script type="text/javascript">
            bkLib.onDomLoaded(function() { 
                nicEditors.allTextAreas() 
            });
        </script>


        <!--        functionaliti-->
        <script src="resources/resources/js/date.js"></script>
        <script src="resources/resources/js/objectInformation.js"></script>


    </body>



</html>


