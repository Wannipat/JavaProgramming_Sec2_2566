import java.util.Scanner;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args)throws IOException {
		
		Scanner rd = new Scanner(new File("d://txtFile//MemberLogin.txt")); //rd == readFile
		 Scanner input = new Scanner(System.in);
		System.out.print("input : ");
	    String Inputemail = rd.nextLine();
	    String tmp = "";
	    while(rd.hasNext()) {
	    	
	    String fname = rd.next();
			String lname = rd.next();
			String pass = rd.next();
			String email = rd.next();
	    	
			if(Inputemail.equals(Inputemail)) {
	    		
	    		System.out.println("Your password is "+pass);
	    	}else {
	    		System.out.println("The data not found...");
	    	}
	    }
	    rd.close();

	}

}
