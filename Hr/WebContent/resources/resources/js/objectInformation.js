$(document)
		.ready(
				function() {

					// personal info object
					$('.container')
							.on(
									'submit',
									'form',
									function() {
										var jsonPersonalInfo = '{'
												+ '"First_name":"'
												+ $(".userName").val()
												+ '",'
												+ '"Last_name":"'
												+ $(".last-nam").val()
												+ '",'
												+ '"DateOfBirth":"'
												+ $(".datepicker").val()
												+ '",'
												+ '"Nationaliti":"'
												+ $(".nationality").val()
												+ '",'
												+ '"Phone_number":"'
												+ $(".phoneNumber").val()
												+ '",'
												+ '"Email":"'
												+ $(".email").val()
												+ '",'
												+ '"Gender":"'
												+ $(".gender").val()
												+ '",'
												+ '"Driving-license":"'
												+ $(".driving-license").val()
												+ '",'
												+ '"Salary_from":"'
												+ $(".salary-from").val()
												+ '",'
												+ '"Salary-to":"'
												+ $(".salary-to").val()
												+ '",'
												+ '"Street":"'
												+ $(".street").val()
												+ '",'
												+ '"City":"'
												+ $(".city").val()
												+ '",'
												+ '"Postal_code":"'
												+ $(".postal-code").val()
												+ '",'
												+ '"Country":"'
												+ $(".country").val()
												+ '",'
												+ '"Profilo_description":"'
												+ $("textarea#pf-description")
														.val()
												+ '",'
												+ '"Work_experience":[],'
												+ '"Education":[],'
												+ '"Certification":[],'
												+ '"Skills":[]' +

												'}';
										var jsPersonalInfo = JSON
												.parse(jsonPersonalInfo);

										// 1. work object
										$('.container')
												.find('.work-info')
												.each(
														function() {
															var jsonWorkExperience = '{'
																	+ '"Company-name":"'
																	+ $(
																			".company-name")
																			.val()
																	+ '",'
																	+ '"Job-title":"'
																	+ $(
																			".job-title")
																			.val()
																	+ '",'
																	+ '"WorkCountry":"'
																	+ $(
																			".workCountry")
																			.val()
																	+ '",'
																	+ '"City":"'
																	+ $(".city")
																			.val()
																	+ '",'
																	+ '"Start-year":"'
																	+ $(
																			".workStartYear")
																			.val()
																	+ '",'
																	+ '"Start-month":"'
																	+ $(
																			".workStartMonth")
																			.val()
																	+ '",'
																	+ '"End-month":"'
																	+ $(
																			".workEndMonth")
																			.val()
																	+ '",'
																	+ '"End-year":"'
																	+ $(
																			".workEndYear")
																			.val()
																	+ '",'
																	+ '"About-experience":"'
																	+ $(
																			".about-experience")
																			.val()
																	+ '"' + '}';
															var jsWorkExperience = JSON
																	.parse(jsonWorkExperience);
															workExperienceArray
																	.push(jsWorkExperience);
															jsPersonalInfo.Work_experience = workExperienceArray;
														});

										// end work Object

										// 2. education object

										$('.container')
												.find('.education')
												.each(
														function() {
															var jsonEducation = '{'
																	+ '"Institute-name":"'
																	+ $(
																			".institute-name")
																			.val()
																	+ '",'
																	+ '"Degree":"'
																	+ $(
																			".degree")
																			.val()
																	+ '",'
																	+ '"Faculty":"'
																	+ $(
																			".faculty")
																			.val()
																	+ '",'
																	+ '"Country":"'
																	+ $(
																			".educationCountry")
																			.val()
																	+ '",'
																	+ '"Profession":"'
																	+ $(
																	".profession")
																	.val()
																	+ '",'
																	+ '"EducationCity":"'
																	+ $(
																			".educationCity")
																			.val()
																	+ '",'
																	+ '"EducationStartTimeYear":"'
																	+ $(
																			".educationStartTimeYear")
																			.val()
																	+ '",'
																	+ '"EducationStartTimeMonth":"'
																	+ $(
																			".educationStartTimeMonth")
																			.val()
																	+ '",'
																	+ '"EducationEndTimeMonth":"'
																	+ $(
																			".educationEndTimeMonth")
																			.val()
																	+ '",'
																	+ '"EducationEndTimeYear":"'
																	+ $(
																			".educationEndTimeYear")
																			.val()
																	+ '",'
																	+ '"AboutEducation":"'
																	+ $(
																			".aboutEducation")
																			.val()
																	+ '"' + '}';

															var jsEducation = JSON
																	.parse(jsonEducation);
															educationArray
																	.push(jsEducation);
															jsPersonalInfo.Education = educationArray;

														});

										// end education object

										// 3. certification object

										$('.container')
												.find('.certification-info')
												.each(
														function() {
															var jsonCertification = '{'
																	+ '"Certification-name":"'
																	+ $(
																			".certification-name")
																			.val()
																	+ '",'
																	+ '"Certification-startTimeYear":"'
																	+ $(
																			".certification-startTimeYear")
																			.val()
																	+ '",'
																	+ '"Certification-startTimeMonth":"'
																	+ $(
																			".certification-startTimeMonth")
																			.val()
																	+ '",'
																	+ '"Certification-endTimeMonth":"'
																	+ $(
																			".certification-endTimeMonth")
																			.val()
																	+ '",'
																	+ '"Certification-endTimeYear":"'
																	+ $(
																			".certification-endTimeYear")
																			.val()
																	+ '",'
																	+ '"AboutCertification":"'
																	+ $(
																			".aboutCertification")
																			.val()
																	+ '"' + '}'

															var jsCertification = JSON
																	.parse(jsonCertification);
															certificationArray
																	.push(jsCertification);
															jsPersonalInfo.Certification = certificationArray;

														});

										// end certification object

										// 4. skill Object

										$('.container')
												.find('.skils')
												.each(
														function() {
															var jsonSkils = '{'
																	+ '"SkillCategoryName":"'
																	+ $(
																			".skillCategoryName")
																			.val()
																	+ '",'
																	+ '"SkillName":[],'
																	+ '"SkillLevel":[]'
																	+ '}'

															var jsSkill = JSON
																	.parse(jsonSkils);

															$('.container')
																	.find(
																			'.skillName')
																	.each(
																			function() {
																				var skillTitle = $(
																						this)
																						.val();
																				var jsonSkillName = '{'
																						+ '"SkillName":"'
																						+ skillTitle
																						+ '"'
																						+ '}';

																				var jsSkillName = JSON
																						.parse(jsonSkillName);
																				jsSkill.SkillName
																						.push(jsSkillName);
																			});

															$('.container')
																	.find(
																			'.skillLevel')
																	.each(
																			function() {
																				var skilllevel = $(
																						this)
																						.val();
																				var jsonSkillLevel = '{'
																						+ '"SkillLevel":"'
																						+ skilllevel
																						+ '"'
																						+ '}';

																				var jsSkillLevel = JSON
																						.parse(jsonSkillLevel);
																				jsSkill.SkillLevel
																						.push(jsSkillLevel);
																			});

															skillArray
																	.push(jsSkill);
															jsPersonalInfo.Skills = skillArray;

														});

										var finalJson = (JSON
												.stringify(jsPersonalInfo))
												.replace(/\\/g, " ");

										$("#jObject").val(finalJson);

										alert(finalJson);
										// $.ajax({
										// type: "POST",
										// url: "addCv",
										// contentType: "application/json",
										//										
										// data:{jObjectt:JSON.stringify(jsonPersonalInfo)},
										//										 
										// success: function(response) {
										// alert("aeeeeeeeeee");
										// }
										// });
									});

					// end skill Object

					// Work-Experience_Array

					var workExperienceArray = JSON.parse("[]");
					$('.work-button').on(
							'click',
							function() {

								var jsonWorkExperience = '{'
										+ '"Company-name":"'
										+ $(".company-name").val()
										+ '",'
										+ '"Job-title":"'
										+ $(".job-title").val()
										+ '",'
										+ '"WorkCountry":"'
										+ $(".workCountry").val()
										+ '",'
										+ '"City":"'
										+ $(".workCity").val()
										+ '",'
										+ '"Start-year":"'
										+ $(".workStartYear").val()
										+ '",'
										+ '"Start-month":"'
										+ $(".workStartMonth").val()
										+ '",'
										+ '"End-month":"'
										+ $(".workEndMonth").val()
										+ '",'
										+ '"End-year":"'
										+ $(".workEndYear").val()
										+ '",'
										+ '"About-experience":"'
										+ $("#about-experience").parent().find(
												'.nicEdit-main ').html()
										+ '"'
										+ '}';
								$(".company-name").val(" ");
								$(".job-title").val(" ");
								$(".workCountry").val("America");
								$(".workCity").val("");
								$(".workStartYear").val("2017");
								$(".workStartMonth").val("1");
								$(".workEndMonth").val("1");
								$(".workEndYear").val("2017");
								$("#about-experience").parent().find(
										'.nicEdit-main ').html("");

								workExperienceArray.push(JSON
										.parse(jsonWorkExperience));
								// alert(workExperienceArray);

							});
					// End-Work-Experience_Array

					// Education_Array

					var educationArray = JSON.parse("[]");
					$('.education-button').on(
							'click',
							function() {

								var jsonEducation = '{' + '"Institute-name":"'
										+ $(".institute-name").val()
										+ '",'
										+ '"Degree":"'
										+ $(".degree").val()
										+ '",'
										+ '"Faculty":"'
										+ $(".faculty").val()
										+ '",'
										+ '"Profession":"'
										+ $(".profession").val()
										+ '",'
										+ '"Education-country":"'
										+ $(".educationCountry").val()
										+ '",'
										+ '"EducationCity":"'
										+ $(".educationCity").val()
										+ '",'
										+ '"EducationStartTimeYear":"'
										+ $(".educationStartTimeYear").val()
										+ '",'
										+ '"EducationStartTimeMonth":"'
										+ $(".educationStartTimeMonth").val()
										+ '",'
										+ '"EducationEndTimeMonth":"'
										+ $(".educationEndTimeMonth").val()
										+ '",'
										+ '"EducationEndTimeYear":"'
										+ $(".educationEndTimeYear").val()
										+ '",'
										+ '"AboutEducation":"'
										+ $("#aboutEducation").parent().find(
												'.nicEdit-main ').html() + '"'
										+ '}';
								$(".institute-name").val(" ");
								$(".degree").val("Pupel");
								$(".faculty").val("");
								$(".profession").val("");
								$(".educationCountry").val("America");
								$(".educationCity").val("");
								$(".educationStartTimeYear").val("2017");
								$(".educationStartTimeMonth").val("1");
								$(".educationEndTimeMonth").val("1");
								$(".educationEndTimeYear").val("2017");
								$("#aboutEducation").parent().find(
										'.nicEdit-main ').html("");

								educationArray.push(JSON.parse(jsonEducation));
								// alert(educationArray);

							});

					$('#educationLogout')
							.click(
									function() {
										for (var i = 0; i < educationArray.length; i++) {
											alert('workExperienceArray:[' + i
													+ '] is: ['
													+ educationArray[i] + ']');
										}
									});
					// End-Education_Array

					// Certification_Array

					var certificationArray = JSON.parse("[]");
					$('.certification-button').on(
							'click',
							function() {

								var jsonCertification = '{'
										+ '"Certification-name":"'
										+ $(".certification-name").val()
										+ '",'
										+ '"Certification-startTimeYear":"'
										+ $(".certification-startTimeYear")
												.val()
										+ '",'
										+ '"Certification-startTimeMonth":"'
										+ $(".certification-startTimeMonth")
												.val()
										+ '",'
										+ '"Certification-endTimeMonth":"'
										+ $(".certification-endTimeMonth")
												.val()
										+ '",'
										+ '"Certification-endTimeYear":"'
										+ $(".certification-endTimeYear").val()
										+ '",'
										+ '"AboutCertification":"'
										+ $("#aboutCertification").parent()
												.find('.nicEdit-main ').html()
										+ '"' + '}';
								$(".certification-name").val(" ");
								$(".certification-startTimeYear").val("2017");
								$(".certification-startTimeMonth").val("1");
								$(".certification-endTimeMonth").val("1");
								$(".certification-endTimeYear").val("2017");
								$("#aboutCertification").parent().find(
										'.nicEdit-main ').html("");

								certificationArray.push(JSON
										.parse(jsonCertification));
								// alert(certificationArray);

							});

					// End-Certification_Array

					// Skill_Array

					var skillArray = JSON.parse('[]');
					$('.skill-button')
							.on(
									'click',
									function() {

										var jsonSkils = '{'
												+ '"SkillCategoryName":"'
												+ $(".skillCategoryName").val()
												+ '",' + '"SkillName":[],'
												+ '"SkillLevel":[]' + '}';

										var jsSkill = JSON.parse(jsonSkils);

										$(".skillCategoryName").val("");

										$('.container')
												.find('.skillName')
												.each(
														function() {
															var skillTitle = $(
																	this).val();
															var jsonSkillName = '{'
																	+ '"SkillName":"'
																	+ skillTitle
																	+ '"' + '}';

															var jsSkillName = JSON
																	.parse(jsonSkillName);
															jsSkill.SkillName
																	.push(jsSkillName);

															var skillTitle = $(
																	this).val(
																	"");
														});

										$('.container')
												.find('.skillLevel')
												.each(
														function() {
															var skilllevel = $(
																	this).val();
															var jsonSkillLevel = '{'
																	+ '"SkillLevel":"'
																	+ skilllevel
																	+ '"' + '}';

															var jsSkillLevel = JSON
																	.parse(jsonSkillLevel);
															jsSkill.SkillLevel
																	.push(jsSkillLevel);

															var skilllevel = $(
																	this)
																	.val(
																			"Elementary");
														});

										skillArray.push(jsSkill);

									});
				});