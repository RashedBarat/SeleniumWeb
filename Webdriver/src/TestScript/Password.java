package TestScript;

import java.util.Base64;

public class Password {
	
	//////////Returning as a function///////////
	
	static String encodedPassword = "QXBwcGl1bTEyMw==";
	
	public static String getencodedPassword(){
		
		return new String(Base64.getDecoder().decode(encodedPassword.getBytes()));
	}
	
	
	
	
///////////This is as a class/////////////

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "Apppium123";
		
		String EncodedPassword = new String(Base64.getEncoder().encode(password.getBytes()));
		System.out.println(EncodedPassword);
		
		String DecodedPassword = new String(Base64.getDecoder().decode(EncodedPassword.getBytes()));
		System.out.println(DecodedPassword);
		

	}*/

}
