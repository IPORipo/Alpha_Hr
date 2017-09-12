package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cv;
import model.CvOfEmployee;
import model.Employee;
import services.CvService;

/**
 * Servlet implementation class showCvs
 */
@WebServlet("/showCvs")
public class showCvs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public showCvs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	CvService service;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// List<Cv>cvs=(List<Cv>)service.getAllCv();
		// RequestDispatcher dispatcher =
		// request.getRequestDispatcher("/WEB-INF/views/ShowCvs.jsp");
		// request.setAttribute("cvs",cvs);
		// dispatcher.forward(request, response);
		try {

			List<CvOfEmployee> cvsLs = (List<CvOfEmployee>) service
					.getAllCvOfEmploee(2);

			List<Cv> cvs = new ArrayList<Cv>();
			response.getWriter().print("rrrreee");
			 for (CvOfEmployee cvOfEmployee : cvsLs) {
			  cvs.add(cvOfEmployee.getCv());
			 }
			 
			 RequestDispatcher dispatcher =
			 request.getRequestDispatcher("/WEB-INF/views/ShowCvs.jsp");
			 request.setAttribute("cvs",cvs);
			 dispatcher.forward(request, response);
			response.getWriter().print("z");
		} catch (Exception e) {
			response.getWriter().print("aeee");
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
