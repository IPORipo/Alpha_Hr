package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the experience database table.
 * 
 */
@Entity
@Table(name="experience")
@NamedQuery(name="Experience.findAll", query="SELECT e FROM Experience e")
public class Experience implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String city;

	@Column(name="company_name")
	private String companyName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	private String info;

	@Column(name="job_title")
	private String jobTitle;

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

	public Experience() {
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

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
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