package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Crypt;

@WebServlet("/testHash")
public class testHash extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public testHash() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String crypted = Crypt.hashMD5("Romaa");
		if (crypted != null) {
			System.out.print(crypted);
		} else {
			System.out.print("probleeeeeeeeeeeeeeeeeeem");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
