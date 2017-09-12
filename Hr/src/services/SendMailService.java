package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SendMailService
 */
@Stateless
@LocalBean
public class SendMailService {

    /**
     * Default constructor. 
     */
    public SendMailService() {
        // TODO Auto-generated constructor stub
    }

    public void send(){
    	/*Send ail to confirm*/
//		HrFunctions.redirect("contact.jsp", request, response);
//		String from = "roma.sumbadze@gmail.com";
//		String password = "goliminda";
//		String username = "roma.sumbadze@gmail.com";
//
//		String to = "roma.sumbadze@alphait.us";//contactName contactPhoneNumber contactEmail contactText
//		String subject = "dailySum";
//		String hash = Crypt.hashMD5("Roma");
//		String text = "Please click to confirm registration http://localhost:8080/Hr/ConfirmMail?hashcode="
//				+ hash +"&mail="+to;
//
//		try {
//			mailBean.sendMail(from, username, password, to, subject, text);
//
//		} catch (Exception e) {
//			response.getWriter().print("Incorrect mail");
//		}

    }
    
}
