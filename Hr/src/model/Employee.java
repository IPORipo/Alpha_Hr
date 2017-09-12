package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@Table(name="employee")
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="company_id")
	private String companyId;

	@Column(name="company_name")
	private String companyName;

	private String logo;

	private String mail;

	private String tel;

	//bi-directional many-to-one association to CvOfEmployee
	@OneToMany(mappedBy="employee")
	private List<CvOfEmployee> cvOfEmployees;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<CvOfEmployee> getCvOfEmployees() {
		return this.cvOfEmployees;
	}

	public void setCvOfEmployees(List<CvOfEmployee> cvOfEmployees) {
		this.cvOfEmployees = cvOfEmployees;
	}

	public CvOfEmployee addCvOfEmployee(CvOfEmployee cvOfEmployee) {
		getCvOfEmployees().add(cvOfEmployee);
		cvOfEmployee.setEmployee(this);

		return cvOfEmployee;
	}

	public CvOfEmployee removeCvOfEmployee(CvOfEmployee cvOfEmployee) {
		getCvOfEmployees().remove(cvOfEmployee);
		cvOfEmployee.setEmployee(null);

		return cvOfEmployee;
	}

}