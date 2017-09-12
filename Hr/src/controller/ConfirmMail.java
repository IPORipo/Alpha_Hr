package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CandidateConfirm;
import services.CandidateConfirmService;
import services.CandidateService;
import services.HrFunctions;

/**
 * Servlet implementation class ConfirmMail
 */
@WebServlet("/ConfirmMail")
public class ConfirmMail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConfirmMail() {
		super();
	}

	@EJB
	CandidateConfirmService confirmService;
	@EJB
	CandidateService candidateService;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String mail = request.getParameter("mail");
		String hashcode = request.getParameter("hashcode");

		CandidateConfirm confirm = confirmService.getConfirmMailService(mail,
				hashcode);

		if (confirm != null) {
			// transaction
			candidateService.addCandidateLikeCandidateConfirm(confirm);// add
																		// CandidateConfirm
																		// to
																		// Candidate

			boolean b = confirmService.deleteCandidateConfirm(confirm);// check
																		// if
																		// CandidateConfirm
																		// is
																		// delated
			// transaction
			response.sendRedirect("/Hr/Login");
			System.out.println("namdvili candidati daemataa");
		} else {
			System.out.println("here is no mail and hash wih this values");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
