package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Candidate;
import model.CandidateConfirm;
import model.Country;

/**
 * Session Bean implementation class CandidateService
 */
@Stateless
@LocalBean
public class CandidateService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public CandidateService() {
		// TODO Auto-generated constructor stub
	}

	public boolean addCandidateLikeCandidateConfirm(CandidateConfirm confirm) {
		Candidate candidate = new Candidate();

		candidate.setName(confirm.getName());
		candidate.setLastName(confirm.getLastName());
		candidate.setMail(confirm.getMail());
		candidate.setPassword(confirm.getPassword());
		candidate.setDob(confirm.getDob());
		candidate.setPhone(confirm.getPhone());

		em.persist(candidate);

		return true;
	}

	public Candidate getCandidateById(int id) {
		Candidate candidate = null;
		try {
			candidate=em.find(Candidate.class, id);
		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return candidate;
	}
}
