package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the candidate_confirm database table.
 * 
 */
@Entity
@Table(name="candidate_confirm")
@NamedQuery(name="CandidateConfirm.findAll", query="SELECT c FROM CandidateConfirm c")
public class CandidateConfirm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Column(name="last_name")
	private String lastName;

	private String mail;

	private String name;

	private String password;

	private String phone;

	public CandidateConfirm() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}