package services;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.UserTransaction;

import model.CandidateConfirm;

/**
 * Session Bean implementation class CandidateService
 */
@Stateless
@LocalBean
public class CandidateConfirmService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public CandidateConfirmService() {
	}

	public void addCandidateToConfirm(CandidateConfirm confirm) {
		em.persist(confirm);
	}

	public boolean deleteCandidateConfirm(CandidateConfirm confirm) {
		try {
			if (!em.contains(confirm)) {
				confirm = em.merge(confirm);
			}

//			em.getTransaction().begin();
			em.remove(confirm);
//			em.getTransaction().commit();
			
			return true;
		} catch (Exception e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public CandidateConfirm getConfirmMailService(String mail, String password) {
		CandidateConfirm confirm = null;
		try {
			TypedQuery<CandidateConfirm> confirmQuery = em
					.createQuery(
							"SELECT confirm FROM CandidateConfirm confirm WHERE confirm.mail = :mail AND confirm.password = :pass",
							CandidateConfirm.class);
			confirmQuery.setParameter("mail", String.valueOf(mail));
			confirmQuery.setParameter("pass", String.valueOf(password));
			confirm = confirmQuery.getSingleResult();

		} catch (Exception ex) {
		}
		return confirm;
	}

}
