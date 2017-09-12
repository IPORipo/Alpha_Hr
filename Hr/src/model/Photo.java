package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the photo database table.
 * 
 */
@Entity
@Table(name="photo")
@NamedQuery(name="Photo.findAll", query="SELECT p FROM Photo p")
public class Photo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="cvId")
	private Cv cv;

	public Photo() {
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

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

}