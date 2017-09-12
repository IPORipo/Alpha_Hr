package services;

import java.security.MessageDigest;

public class Crypt {

	public static String hashMD5(String password){
		try {	
			
	        MessageDigest md = MessageDigest.getInstance("MD5");
	        md.update(password.getBytes());

	        byte byteData[] = md.digest();
	        StringBuffer hexString = new StringBuffer();
	    	for (int i=0;i<byteData.length;i++) {
	    		String hex=Integer.toHexString(0xff & byteData[i]);
	   	     	if(hex.length()==1) hexString.append('0');
	   	     	hexString.append(hex);
	    	}
	    	return hexString.toString();
			
		} catch (Exception e) {  
			System.out.print("Here is a problem with hashing");
		}
		return null;
	}
	
	
}
