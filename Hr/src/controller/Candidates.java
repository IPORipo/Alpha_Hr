package controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.ws.runtime.dev.Session;

import model.Cv;
import model.Education;
import services.CvService;
import services.HrFunctions;

/**
 * Servlet implementation class Candidates
 */
@WebServlet("/Candidates")
public class Candidates extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	CvService cvService;

	public Candidates() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HrFunctions.redirect("candidates.jsp", request, response);
		
		List<Cv>cvs = cvService.getAllCv();
		request.getSession().setAttribute("cvs", cvs);
		
		HrFunctions.redirect("candidates.jsp", request, response);
		
	}
}
