package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cv_of_employee database table.
 * 
 */
@Entity
@Table(name="cv_of_employee")
@NamedQuery(name="CvOfEmployee.findAll", query="SELECT c FROM CvOfEmployee c")
public class CvOfEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="cvId")
	private Cv cv;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="employeeId")
	private Employee employee;

	public CvOfEmployee() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}