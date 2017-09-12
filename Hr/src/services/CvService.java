package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.jasper.tagplugins.jstl.ForEach;

import model.Candidate;
import model.Certification;
import model.Country;
import model.Cv;
import model.CvOfEmployee;
import model.Education;
import model.Employee;
import model.Experience;
import model.Photo;
import model.RipTable;
import model.Skill;
import model.SkillCategory;

/**
 * Session Bean implementation class CvService
 */
@Stateless
@LocalBean
public class CvService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public CvService() {
		// TODO Auto-generated constructor stub
	}

	public void saveCv(Cv cv, model.Address adrr,
			List<Education> educations, List<Experience> experiences,
			List<Certification> certifications,
			List<SkillCategory> skillCategories, List<Skill> skills,
			Photo photo) {
		em.persist(cv);
		em.persist(adrr);
		
		/* persist Education */
		for (Education education : educations) {
			em.persist(education);
		}

		/* persist Experience */
		for (Experience experience : experiences) {
			em.persist(experience);
		}

		/* persist Certification */
		for (Certification certification : certifications) {
			em.persist(certification);
		}

		/* persist Skills */
		for (Skill skill : skills) {
			em.persist(skill);
		}

		for (SkillCategory category : skillCategories) {
			em.persist(category);
		}
		em.persist(photo);
	}

	public void addAdr(model.Address adrr, Country coun) {
		em.persist(adrr);
		em.persist(coun);
	}

	public List<Cv> getAllCv() {
		TypedQuery<Cv> cvQuery = em.createNamedQuery("Cv.findAll", Cv.class);
		List<Cv> cvs = cvQuery.getResultList();
		return cvs;
	}

	// public Cv getCvByMail(String mail, String password) {
	// Cv cv = null;
	// try {
	// TypedQuery<Cv> cvQuery = em
	// .createQuery(
	// "SELECT cv FROM Cv cv WHERE cv.mail = :mail AND cv.tel = :pass",
	// Cv.class);
	// cvQuery.setParameter("mail", String.valueOf(mail));
	// cvQuery.setParameter("pass", String.valueOf(password));
	// cv = cvQuery.getSingleResult();
	//
	// } catch (Exception ex) {
	// }
	// return cv;
	// }

	public List<CvOfEmployee> getAllCvOfEmploee(int id) {
		List<CvOfEmployee> cvs = null;
		try {
			TypedQuery<Employee> empId = em.createQuery(
					"SELECT emp FROM Employee emp WHERE emp.id = :em",
					Employee.class);// searching for emlpoyee with id
			empId.setParameter("em", 2);
			Employee emp = empId.getSingleResult();

			TypedQuery<CvOfEmployee> cvQuery = em.createQuery(
					"SELECT c FROM CvOfEmployee c WHERE c.employee = :emid",
					CvOfEmployee.class);// searching CcOfEmployee with employee

			cvQuery.setParameter("emid", emp);
			cvs = cvQuery.getResultList();

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return cvs;
	}

	public void addRipTabe(RipTable r) {
		em.persist(r);
	}

}
