import java.util.Scanner;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args)throws IOException {
		Scanner rd = new Scanner(new File("d://txtFile//MemberLogin.txt")); //rd == readFile

		while(rd.hasNextLine()) {
			String fname = rd.next();
			String lname = rd.next();
			rd.next();
			String email = rd.next();
			System.out.println(lname.substring(0,1)+"."+fname+"("+email.toUpperCase()+")");
		}
		rd.close();
	}

}
