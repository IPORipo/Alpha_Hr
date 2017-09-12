package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Candidate;
import model.Cv;
import services.Crypt;
import services.CvService;
import services.HrFunctions;
import services.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	LoginService service;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {// if login form isnot submited
		if (request.getSession().getAttribute("id") != null) {// if someone is authorized,redirect to home page
			response.sendRedirect("Home");
		} else
			HrFunctions.redirect("login.jsp", request, response);// else show login form
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {// works if login is submited
		String mail = request.getParameter("uname");
		String pass = Crypt.hashMD5(request.getParameter("psw"));

		try {
			if (mail != null && pass != null) {// if every filed is filled

				Candidate candidate = service.getCandidateIfExists(mail, pass);

				if (candidate == null) {// if cv not found go to login page
					System.out.println("veraaaa");
					request.setAttribute("message",
							"Please fill in correct info");
					HrFunctions.redirect("login.jsp", request, response);
				} else {// if cv is found we are filling session info
					HttpSession session = request.getSession();
					session.setAttribute("username", candidate.getName());
					session.setAttribute("mail", candidate.getMail());
					session.setAttribute("id", candidate.getId());
					System.out.println(session.getAttribute("id"));

					response.sendRedirect("/Hr/PersonalInfoOfCandidate");
				}
			} else {// if fileds arenot filled
				HrFunctions.redirect("login.jsp", request, response);
			}
		} catch (Exception e) {
			HrFunctions.redirect("login.jsp", request, response);

		}
	}

}
