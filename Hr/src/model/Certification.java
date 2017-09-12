package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the certification database table.
 * 
 */
@Entity
@Table(name="certification")
@NamedQuery(name="Certification.findAll", query="SELECT c FROM Certification c")
public class Certification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="certificate_name")
	private String certificateName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	@Lob
	private String info;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="cvId")
	private Cv cv;

	public Certification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCertificateName() {
		return this.certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
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

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

}