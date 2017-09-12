<%@page import="org.apache.jasper.tagplugins.jstl.ForEach"%>
<%@page import="model.*"%>

<%@page import="java.util.*;"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<%
		List<Cv>cvs = (List<Cv>)request.getAttribute("cvs");
		
		for(Cv cv : cvs){
	%>
	<%=cv.getId()%><br>
	<%=cv.getFirstName()%><br>
	<%=cv.getLastName()%><br>
	<%=cv.getGender()%><br>
	<%=cv.getMail()%><br>
	<%=cv.getDrivingLicense()%><br>
	<%=cv.getMotivationLetter()%><br>
	<%=cv.getNationality()%><br>
	<%=cv.getSalleryFrom()%><br>
	<%=cv.getSalleryTo()%><br>
	<%=cv.getTel()%><br>
	

	<br>
	<br>
	Education
	<br>	
	<br>	
	<%
		for(Education ed : cv.getEducations()){
	%>
	
	<%=ed.getDegree() %><br>
	<%=ed.getCity() %><br>
	<%=ed.getFaculty() %><br>
	<%=ed.getInstitution() %><br>
	<%=ed.getProfession() %><br>
	<%=ed.getCountry() %><br>
	<%=ed.getStartDate() %><br>
	<%=ed.getEndDate() %><br>
	
	<%
		}
	%>
	
	<br>
	<br>
	Experience
	<br>	
	<br>	
	<%
		for(Experience ex : cv.getExperiences()){
	%>
	
	<%=ex.getCompanyName() %><br>
	<%=ex.getCity() %><br>
	<%=ex.getInfo() %><br>
	<%=ex.getJobTitle() %><br>
	<%=ex.getCountry() %><br>
	<%=ex.getStartDate() %><br>
	<%=ex.getEndDate() %><br>
	<%
		}
	%>

	<br>
	<br>
	Certification
	<br>	
	<br>	
	<%
		for(Certification cert: cv.getCertifications()){
	%>
	asdasdss
	<%=cert.getCertificateName()%><br>
	<%=cert.getInfo()%><br>
	<%=cert.getStartDate()%><br>
	<%=cert.getEndDate()%><br>
		<%
		}
	%>


	<br>
	<br>

	<%
		}
	%>


</body>
</html>