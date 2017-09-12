package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Cv;
import model.Employee;

/**
 * Session Bean implementation class EmployeeService
 */
@Stateless
@LocalBean
public class EmployeeService {

	@PersistenceContext(unitName = "Hrr")
	EntityManager em;

	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}

	public Employee getById(int id) {
		TypedQuery<Employee> empQuery = em.createNamedQuery(
				"SELECT em FROM Employee em WHERE em.id=:id ", Employee.class);
		Employee employee = empQuery.getSingleResult();
		return employee;

	}

}
