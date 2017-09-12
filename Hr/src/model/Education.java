package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the education database table.
 * 
 */
@Entity
@Table(name="education")
@NamedQuery(name="Education.findAll", query="SELECT e FROM Education e")
public class Education implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String city;

	private String degree;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	private String faculty;

	private String info;

	private String institution;

	private String profession;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="countryId")
	private Country country;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="cvId")
	private Cv cv;

	public Education() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

}