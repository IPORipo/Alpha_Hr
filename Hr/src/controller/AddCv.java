package controller;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale.Category;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cv;
import model.RipTable;
import services.CandidateService;
import services.CountryService;
import services.CvService;
import services.HrFunctions;

import com.sun.jndi.cosnaming.IiopUrl.Address;

import model.Candidate;
import model.Certification;
import model.Country;
import model.Cv;
import model.CvOfEmployee;
import model.Education;
import model.Employee;
import model.Experience;
import model.Photo;
import model.Skill;
import model.SkillCategory;
import services.CvService;

@WebServlet("/AddCv")
public class AddCv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCv() {
		super();
	}

	@EJB
	CvService service;

	@EJB
	CountryService countryService;

	@EJB
	CandidateService candidateService;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {//if submit isnot clicked 
		if (request.getSession().getAttribute("username") != null) {//if candidate is loged in
			HrFunctions.redirect("cv.jsp", request, response);//redirect to addcv page
		} else {
			response.sendRedirect("/Hr/Login");//else redirect to login page
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {//if form is fileed and submit is clicked
		if (request.getSession().getAttribute("username") != null) {//if post is made after log in
			try {
				JSONObject jObject = (JSONObject) new JSONParser()
						.parse(request.getParameter("jObject"));

				// --------------------------------------------------------
				// ----------------Cv mainInfo----------------
				// --------------------------------------------------------
				Cv cv = new Cv();
				// Nationality
				String firstName = (String) jObject.get("First_name");
				String lastName = (String) jObject.get("Last_name");
				String mail = (String) jObject.get("Email");
				String tel = (String) jObject.get("Phone_number");
				String gender = (String) jObject.get("Driving-license");

				Date dob = HrFunctions.parseStringToDate((String) jObject
						.get("DateOfBirth"));

				double salleryFrom;// minimal sallery
				double salleryTo;// maximal sallery

				try {
					salleryFrom = Double.valueOf((String) jObject
							.get("Salary_from"));
				} catch (Exception e) {
					salleryFrom = 0;
				}

				try {
					salleryTo = Double.valueOf((String) jObject
							.get("Salary-to"));
				} catch (Exception e) {
					salleryTo = Integer.MAX_VALUE;
				}

				// sallery exception
				int drivingLicense = Integer.parseInt((String) jObject
						.get("Driving-license"));
				String motivationLetter = (String) jObject
						.get("Profilo_description");

				cv.setFirstName(firstName);
				cv.setLastName(lastName);
				cv.setMail(mail);
				cv.setTel(tel);
				cv.setGender(gender);
				cv.setDob(dob);
				cv.setDrivingLicense(1);
				cv.setSalleryFrom(salleryFrom);
				cv.setSalleryTo(salleryTo);
				cv.setMotivationLetter(motivationLetter);
				cv.setNationality("Georgian");

				// --------------------------------------------------------
				// ----------------Photo----------------
				// --------------------------------------------------------
				String photoName = request.getParameter("cv_photo");
				Photo photo = new Photo();
				photo.setName(photoName);
				photo.setCv(cv);
				/*----------------End of Photo----------------*/

				// --------------------------------------------------------
				// ----------------Address of cv----------------
				// --------------------------------------------------------
				model.Address adr = new model.Address();

				Country addressCountry = countryService
						.getCountryByName((String) jObject.get("Country"));
				adr.setCountry(addressCountry);
				adr.setPostalCode("Postal_code");
				adr.setStreet("Street");
				adr.setCity((String) jObject.get("City"));
				adr.setCv(cv);// append to cv
				/*----------------End of Address----------------*/

				// --------------------------------------------------------
				// ----------------Experience----------------
				// --------------------------------------------------------
				// Reading the array
				JSONArray jArrayExperiences = (JSONArray) jObject
						.get("Work_experience");
				List<Experience> experiences = new ArrayList<>();

				for (int i = 0; i < jArrayExperiences.size(); i++) {

					JSONObject jExperience = (JSONObject) jArrayExperiences
							.get(i);
					Experience experience = new Experience();
					String companyName = (String) jExperience
							.get("Company-name");
					String jobTitle = (String) jExperience.get("Job-title");
					String city = (String) jExperience.get("City");
					String experienceInfo = (String) jExperience
							.get("About-experience");
					// generates experience end date
					Date expEnd = HrFunctions.parseStringToDate(
							(String) jExperience.get("End-month"),
							(String) jExperience.get("End-year"));

					// generates experience start date
					Date expStart = HrFunctions.parseStringToDate(
							(String) jExperience.get("Start-month"),
							(String) jExperience.get("Start-year"));
					Country experienceCountry = countryService
							.getCountryByName((String) jObject
									.get("WorkCountry"));

					experience.setCompanyName(companyName);
					experience.setJobTitle(jobTitle);
					experience.setCity(city);
					experience.setCountry(experienceCountry);// Country where
																// candidate was
																// experienced

					experience.setStartDate(expStart);// change date---
					experience.setEndDate(expEnd);// change date---
					experience.setInfo(experienceInfo);

					experience.setCv(cv);// append to cv

					experiences.add(experience);

				}
				/*----------------End of Experience----------------*/

				// --------------------------------------------------------
				// ----------------Education----------------
				// --------------------------------------------------------
				JSONArray jArrayEducation = (JSONArray) jObject
						.get("Education");
				List<Education> educations = new ArrayList<>();

				for (int i = 0; i < jArrayEducation.size(); i++) {
					Education education = new Education();
					JSONObject jEducation = (JSONObject) jArrayEducation.get(i);
					String institution = (String) jEducation
							.get("Institute-name");
					String degree = (String) jEducation.get("Degree");
					String faculty = (String) jEducation.get("Faculty");
					String profession = (String) jEducation.get("Profession");
					String educationCity = (String) jEducation
							.get("EducationCity");

					String educationInfo = (String) jEducation
							.get("AboutEducation");
					// generates education start date
					Date eduStart = HrFunctions.parseStringToDate(
							(String) jEducation.get("EducationStartTimeMonth"),
							(String) jEducation.get("EducationStartTimeYear"));

					// generates education end date
					Date eduEnd = HrFunctions.parseStringToDate(
							(String) jEducation.get("EducationEndTimeMonth"),
							(String) jEducation.get("EducationEndTimeYear"));
					Country educationCountry = countryService
							.getCountryByName((String) jObject
									.get("Education-country"));

					education.setInstitution(institution);// sets institution
					System.out.print(education.getInstitution());
					education.setDegree(degree);// sets degree
					education.setFaculty(faculty);// sets faculty
					education.setProfession(profession);// sets profession
					education.setCity(educationCity);// sets education city
					education.setCountry(educationCountry);// change country
					education.setInfo(educationInfo);//
					education.setStartDate(eduStart);// sets end date
					education.setEndDate(eduEnd);// sets starting date
					education.setCv(cv);// append to cv

					educations.add(education);
				}
				/*----------------End of Education----------------*/

				// --------------------------------------------------------
				// ----------------Certification----------------
				// --------------------------------------------------------
				JSONArray jArrayCertification = (JSONArray) jObject
						.get("Certification");

				// variable where will be saved all certifications and then will
				// be sent to persist to database
				List<Certification> certifications = new ArrayList<>();
				for (int i = 0; i < jArrayCertification.size(); i++) {

					// local variable to set values foreach certification and
					// then add to certifications array
					Certification certification = new Certification();

					JSONObject jCertification = (JSONObject) jArrayCertification
							.get(i);
					String certificationName = (String) jCertification
							.get("Certification-name");
					String certificationInfo = (String) jCertification
							.get("AboutCertification");
					// generates certification end date
					Date certEnd = HrFunctions.parseStringToDate(
							(String) jCertification
									.get("Certification-endTimeMonth"),
							(String) jCertification
									.get("Certification-endTimeYear"));
					// generates certification start date
					Date certStart = HrFunctions.parseStringToDate(
							(String) jCertification
									.get("Certification-startTimeMonth"),
							(String) jCertification
									.get("Certification-startTimeYear"));

					// set values to certification
					certification.setCertificateName(certificationName);// sets
																		// certification
																		// name
					certification.setInfo(certificationInfo);// sets detailed
																// description
					certification.setStartDate(certStart);// sets start date of
															// certificating
					certification.setEndDate(certEnd);// sets end date of
														// certificating
					certification.setCv(cv);// append to cv
					certifications.add(certification);// add certification to
														// certifications array
				}
				/*----------------End of Certification----------------*/

				// --------------------------------------------------------
				// ----------------Skills----------------
				// --------------------------------------------------------
				JSONArray jArraySkills = (JSONArray) jObject.get("Skills");
				List<Skill> skills = new ArrayList<>();
				List<SkillCategory> skillCategories = new ArrayList<>();

				for (int i = 0; i < jArraySkills.size(); i++) {
					SkillCategory skillCategory = new SkillCategory();
					JSONObject jSkill = (JSONObject) jArraySkills.get(i);

					String categoryName = (String) jSkill
							.get("SkillCategoryName");
					JSONArray jSkillNames = (JSONArray) jSkill.get("SkillName");
					JSONArray jSkillLevels = (JSONArray) jSkill
							.get("SkillLevel");

					for (int j = 0; j < jSkillNames.size(); j++) {
						Skill skill = new Skill();
						String skillName = (String) ((JSONObject) jSkillNames
								.get(j)).get("SkillName");
						int skillLevel = HrFunctions
								.LevelToInt((String) ((JSONObject) jSkillLevels
										.get(j)).get("SkillLevel"));
						skill.setName(skillName);
						skill.setLevel(skillLevel);
						skills.add(skill);
						skill.setSkillCategory(skillCategory);// append category
																// to skill
						skills.add(skill);
					}
					skillCategory.setCategoryName(categoryName);
					skillCategory.setCv(cv);// append category to cv
					skillCategories.add(skillCategory);
				}

				for (Skill skillCategory : skills) {
					System.out.println(skillCategory.getName());
				}
				/*----------------End of Skills----------------*/

				// --------------------------------------------------------
				// ----------------Create Candidate----------------
				// --------------------------------------------------------
				Candidate can = candidateService.getCandidateById((int) request
						.getSession().getAttribute("id"));
				System.out.println(can.getId());
				cv.setCandidate(can);
				/*----------------End of Candidate----------------*/

				// --------------------------------------------------------
				// ----------------Create Employee----------------
				// --------------------------------------------------------
				//			Employee emploee = new Employee();// Employ ara compania unda
				//												// iyos
				//			emploee.setCompanyName("alphaholding");
				//			emploee.setLogo("ripLogo");
				//			emploee.setMail("ripp@mail.ge");
				//			emploee.setTel("557777667");
				//			/*----------------End of Employee----------------*/
				//			CvOfEmployee cvEmp = new CvOfEmployee();// add to bucket
				//			cvEmp.setCv(cv);
				//			cvEmp.setEmployee(emploee);
				//			cv.setCandidate(can);

				service.saveCv(cv, adr, educations, experiences,
						certifications, skillCategories, skills, photo);// save cv

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {//if youser is not authorized and if post is made after signout
			response.sendRedirect("/Hr/Login");//else redirect to login page
		}

	}
}
