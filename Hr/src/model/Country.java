package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the country database table.
 * 
 */
@Entity
@Table(name="country")
@NamedQuery(name="Country.findAll", query="SELECT c FROM Country c")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="country_code")
	private String countryCode;

	@Column(name="country_name")
	private String countryName;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="country")
	private List<Address> addresses;

	//bi-directional many-to-one association to Education
	@OneToMany(mappedBy="country")
	private List<Education> educations;

	//bi-directional many-to-one association to Experience
	@OneToMany(mappedBy="country")
	private List<Experience> experiences;

	public Country() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setCountry(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setCountry(null);

		return address;
	}

	public List<Education> getEducations() {
		return this.educations;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public Education addEducation(Education education) {
		getEducations().add(education);
		education.setCountry(this);

		return education;
	}

	public Education removeEducation(Education education) {
		getEducations().remove(education);
		education.setCountry(null);

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
		experience.setCountry(this);

		return experience;
	}

	public Experience removeExperience(Experience experience) {
		getExperiences().remove(experience);
		experience.setCountry(null);

		return experience;
	}

}