import java.util.Scanner;
import java.io.*;
public class Example1201 {

	public static void main(String[] args) throws IOException {
	//use Sccanner Class read data from file
		Scanner rd = new Scanner(new File("d://txtFile//MemberLogin.txt")); //rd == readFile
	while(rd.hasNext()) {
		String fname = rd.next(); //read name data to fname va
		String lname = rd.next(); //read surname data to lname variable
		rd.next(); //read password data
		String email = rd.next().toUpperCase(); //read email 
		
		System.out.println(fname + "("+email+")");
		
	}
	rd.close();

	}
}
