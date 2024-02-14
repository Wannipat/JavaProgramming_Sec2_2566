import java.io.*;
import java.util.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		//Creat object for input data from keyboard
		Scanner sc = new Scanner(System.in);
		String choice,department;
		System.out.print("insert or read data?: ");
		choice = sc.next().toLowerCase();
		while(!(choice.equals("insert"))&& !(choice.equals("read"))) {
			System.out.println("Plase type insert or read data,again: ");
			choice = sc.next().toLowerCase();
			
		}
		//creat object : call all method in class saveandOpen
		SaveandOpen obj = new SaveandOpen();
		int i=1;
		if(choice.equals("insert")) {
			obj.insert();//call insert method from class saveandopen
		}else if(choice.equals("read")) {
			System.out.print("\nEnter department: ");
			department = sc.next();
			obj.setDept(department); //send department to setDept() from class Employee
			obj.read();
			obj.header(); 
			
		}

	}

}
