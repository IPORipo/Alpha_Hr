package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Country;
import model.CvOfEmployee;
import model.Employee;

/**
 * Session Bean implementation class CountryService
 */
@Stateless
@LocalBean
public class CountryService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public CountryService() {
	}

	public Country getCountryByName(String name) {
		Country country = null;
		try {
			TypedQuery<Country> countryQuery = em.createQuery(
					"SELECT country FROM Country country WHERE countryName = :name",
					Country.class);// searching for emlpoyee with id
			countryQuery.setParameter("name", String.valueOf(name));
			country= countryQuery.getSingleResult();

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
		return country;
	}

}
