package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MailSenderBean;
import services.Crypt;
import services.HrFunctions;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	MailSenderBean mailBean;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	// protected void doGet(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	// HrFunctions.redirect("contact.jsp", request, response);
	// String from = "roma.sumbadze@gmail.com";
	// String password = "goliminda";
	// String username = "roma.sumbadze@gmail.com";
	//
	// String to = "roma.sumbadze@alphait.us";//contactName contactPhoneNumber
	// contactEmail contactText
	// String subject = "dailySum";
	// String hash = Crypt.hashMD5("Roma");
	// String text =
	// "Today i have made mail sending logic for confirmation mail...also i have written cv searching logic for Employee http://localhost:8080/Hr/ConfirmMail?hashcode="
	// + hash +"&mail="+to;
	//
	// try {
	// mailBean.sendMail(from, username, password, to, subject, text);
	//
	// } catch (Exception e) {
	// response.getWriter().print("Incorrect mail");
	// }
	// }
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HrFunctions.redirect("contact.jsp", request, response);

		String contactName = request.getParameter("contactName");
		String contactEmail = request.getParameter("contactEmail");
		String contactPhone = request.getParameter("contactPhoneNumber");
		String contactText = request.getParameter("contactText");

		String from = "roma.sumbadze@gmail.com";// this is alphas mail from
												// which mail is sending and
												// imittating client
		String password = "goliminda";
		String username = "roma.sumbadze@gmail.com";
		String to = "roma.sumbadze@alphait.us";// it is alpahs site where
												// messages will be sent
		String subject = "HrContact";
		String text = "From:" + contactEmail + "<br> Name:" + contactName
				+ "<br> Phone:" + contactPhone + "<br>Text:<br>" + contactText;
		try {
			mailBean.sendMail(from, username, password, to, subject, text);
		} catch (Exception e) {

			response.sendRedirect("Contact");
			;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
