package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the skill database table.
 * 
 */
@Entity
@Table(name="skill")
@NamedQuery(name="Skill.findAll", query="SELECT s FROM Skill s")
public class Skill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int level;

	private String name;

	//bi-directional many-to-one association to SkillCategory
	@ManyToOne
	@JoinColumn(name="categoryId")
	private SkillCategory skillCategory;

	public Skill() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SkillCategory getSkillCategory() {
		return this.skillCategory;
	}

	public void setSkillCategory(SkillCategory skillCategory) {
		this.skillCategory = skillCategory;
	}

}