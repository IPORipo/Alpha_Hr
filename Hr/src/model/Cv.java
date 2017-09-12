package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cv database table.
 * 
 */
@Entity
@Table(name="cv")
@NamedQuery(name="Cv.findAll", query="SELECT c FROM Cv c")
public class Cv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Column(name="driving_license")
	private int drivingLicense;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="last_name")
	private String lastName;

	private String mail;

	@Lob
	@Column(name="motivation_letter")
	private String motivationLetter;

	private String nationality;

	@Column(name="sallery_from")
	private double salleryFrom;

	@Column(name="sallery_to")
	private double salleryTo;

	private String tel;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="cv")
	private List<Address> addresses;

	//bi-directional many-to-one association to Certification
	@OneToMany(mappedBy="cv")
	private List<Certification> certifications;

	//bi-directional many-to-one association to Candidate
	@ManyToOne
	@JoinColumn(name="candidateId")
	private Candidate candidate;

	//bi-directional many-to-one association to CvOfEmployee
	@OneToMany(mappedBy="cv")
	private List<CvOfEmployee> cvOfEmployees;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="cv")
	private List<Education> educations;

	//bi-directional many-to-one association to Experience
	@OneToMany(mappedBy="cv")
	private List<Experience> experiences;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="cv")
	private List<Photo> photos;

	//bi-directional many-to-one association to SkillCategory
	@OneToMany(mappedBy="cv")
	private List<SkillCategory> skillCategories;

	public Cv() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getDrivingLicense() {
		return this.drivingLicense;
	}

	public void setDrivingLicense(int drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotivationLetter() {
		return this.motivationLetter;
	}

	public void setMotivationLetter(String motivationLetter) {
		this.motivationLetter = motivationLetter;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public double getSalleryFrom() {
		return this.salleryFrom;
	}

	public void setSalleryFrom(double salleryFrom) {
		this.salleryFrom = salleryFrom;
	}

	public double getSalleryTo() {
		return this.salleryTo;
	}

	public void setSalleryTo(double salleryTo) {
		this.salleryTo = salleryTo;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setCv(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setCv(null);

		return address;
	}

	public List<Certification> getCertifications() {
		return this.certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

	public Certification addCertification(Certification certification) {
		getCertifications().add(certification);
		certification.setCv(this);

		return certification;
	}

	public Certification removeCertification(Certification certification) {
		getCertifications().remove(certification);
		certification.setCv(null);

		return certification;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public List<CvOfEmployee> getCvOfEmployees() {
		return this.cvOfEmployees;
	}

	public void setCvOfEmployees(List<CvOfEmployee> cvOfEmployees) {
		this.cvOfEmployees = cvOfEmployees;
	}

	public CvOfEmployee addCvOfEmployee(CvOfEmployee cvOfEmployee) {
		getCvOfEmployees().add(cvOfEmployee);
		cvOfEmployee.setCv(this);

		return cvOfEmployee;
	}

	public CvOfEmployee removeCvOfEmployee(CvOfEmployee cvOfEmployee) {
		getCvOfEmployees().remove(cvOfEmployee);
		cvOfEmployee.setCv(null);

		return cvOfEmployee;
	}

	public List<Education> getEducations() {
		return this.educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public Education addEducation(Education education) {
		getEducations().add(education);
		education.setCv(this);

		return education;
	}

	public Education removeEducation(Education education) {
		getEducations().remove(education);
		education.setCv(null);

		return education;
	}

	public List<Experience> getExperiences() {
		return this.experiences;
	}

	public void setExperiences(List<Experience> experiences) {
		this.experiences = experiences;
	}

	public Experience addExperience(Experience experience) {
		getExperiences().add(experience);
		experience.setCv(this);

		return experience;
	}

	public Experience removeExperience(Experience experience) {
		getExperiences().remove(experience);
		experience.setCv(null);

		return experience;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Photo addPhoto(Photo photo) {
		getPhotos().add(photo);
		photo.setCv(this);

		return photo;
	}

	public Photo removePhoto(Photo photo) {
		getPhotos().remove(photo);
		photo.setCv(null);

		return photo;
	}

	public List<SkillCategory> getSkillCategories() {
		return this.skillCategories;
	}

	public void setSkillCategories(List<SkillCategory> skillCategories) {
		this.skillCategories = skillCategories;
	}

	public SkillCategory addSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().add(skillCategory);
		skillCategory.setCv(this);

		return skillCategory;
	}

	public SkillCategory removeSkillCategory(SkillCategory skillCategory) {
		getSkillCategories().remove(skillCategory);
		skillCategory.setCv(null);

		return skillCategory;
	}

}