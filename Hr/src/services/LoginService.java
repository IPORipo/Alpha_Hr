package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Candidate;
import model.Cv;

/**
 * Session Bean implementation class LoginService
 */
@Stateless
@LocalBean
public class LoginService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public LoginService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Candidate getCandidateIfExists(String mail, String password) {
		Candidate candidate = null;
		try {
			TypedQuery<Candidate > cvQuery = em
					.createQuery(
							"SELECT candidate FROM Candidate candidate WHERE candidate.mail = :mail AND candidate.password = :pass",
							Candidate .class);
			cvQuery.setParameter("mail", String.valueOf(mail));
			cvQuery.setParameter("pass", String.valueOf(password));
			candidate = cvQuery.getSingleResult();

		} catch (Exception ex) {
		}
		return candidate;
	}

}
