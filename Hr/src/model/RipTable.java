package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ripTable database table.
 * 
 */
@Entity
@Table(name="ripTable")
@NamedQuery(name="RipTable.findAll", query="SELECT r FROM RipTable r")
public class RipTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	public RipTable() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}