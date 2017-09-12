package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the skillCategory database table.
 * 
 */
@Entity
@Table(name="skillCategory")
@NamedQuery(name="SkillCategory.findAll", query="SELECT s FROM SkillCategory s")
public class SkillCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="category_name")
	private String categoryName;

	//bi-directional many-to-one association to Skill
	@OneToMany(mappedBy="skillCategory")
	private List<Skill> skills;

	//bi-directional many-to-one association to Cv
	@ManyToOne
	@JoinColumn(name="cvId")
	private Cv cv;

	public SkillCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Skill addSkill(Skill skill) {
		getSkills().add(skill);
		skill.setSkillCategory(this);

		return skill;
	}

	public Skill removeSkill(Skill skill) {
		getSkills().remove(skill);
		skill.setSkillCategory(null);

		return skill;
	}

	public Cv getCv() {
		return this.cv;
	}

	public void setCv(Cv cv) {
		this.cv = cv;
	}

}