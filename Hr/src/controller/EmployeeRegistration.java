package controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CandidateConfirm;
import model.MailSenderBean;
import services.CandidateConfirmService;
import services.Crypt;
import services.HrFunctions;

/**
 * Servlet implementation class EmployeeRegistration
 */
@WebServlet("/EmployeeRegistration")
public class EmployeeRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	CandidateConfirmService candidateService;

	@EJB
	MailSenderBean mailBean;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HrFunctions.redirect("employeeRegistration.jsp", request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// /* Create date */
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2000);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.YEAR, 2000);
		// Date date = cal.getTime();
		Date date = new Date();

		/* Create properties */
		String lastName = request.getParameter("name");
		String name = request.getParameter("LastName");
		String mail = request.getParameter("email");
		String password = request.getParameter("psw");
		String phone = request.getParameter("phoneNumber");
		String hashCode = Crypt.hashMD5(password);

		/* Fill Candidate with values */
		CandidateConfirm can = new CandidateConfirm();
		can.setLastName(lastName);
		can.setDob(date);
		can.setName(name);
		can.setMail(mail);
		can.setPassword(hashCode);
		can.setPhone(phone);

		candidateService.addCandidateToConfirm(can);

		/* Send mail */
		String from = "roma.sumbadze@gmail.com";
		String pass = "goliminda";
		String username = "roma.sumbadze@gmail.com";
		String to = mail;// contactName contactPhoneNumber contactEmail
							// contactText
		String subject = "Confirm password";
		String text = "Please click to confirm registration http://localhost:8080/Hr/ConfirmMail?hashcode="
				+ hashCode + "&mail=" + to;
		try {
			mailBean.sendMail(from, username, pass, to, subject, text);
			System.out.println("confirm maili warmatebit gaigzavma");
			response.sendRedirect("/Hr/Login");
		} catch (Exception e) {
			System.out.println("confirm maili ver gaigzavna");
		}
	}

}
