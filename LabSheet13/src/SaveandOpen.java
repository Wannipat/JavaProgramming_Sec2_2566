import java.io.*;
import java.rmi.server.ObjID;
import java.util.*;
public class SaveandOpen extends Employee{
private String name;
private String dept;

public void insert() throws IOException{
	
	//creat object for writdata to file using PrintStrem class
	PrintStream writeFile = new PrintStream(new File("D://textFile//employee.txt"));//PrintStreamเขียนทับของเดิม  //PrintWriterจะต่อท้ายของเดิม
	//Creat object for input data from keyboard
	Scanner sc = new Scanner(System.in);

	String anwer;
do {
    header();
	System.out.print("Enter name: ");
    name = sc.next();
    System.out.print("Enter department: ");
    dept = sc.next();
    
    //save all data to file
    writeFile.println(name+"\t"+dept);
	System.out.print("Enter data again? : ");
	anwer = sc.next().toLowerCase();
}while(anwer.equals("y"));


}
public void read() {
	try {
		//Creat object for
		Scanner readFile = new Scanner(new File("D://textFile//employee.txt"));
		boolean check = false;
		int i =1;
		header();
		while(readFile.hasNext()) {
			name = readFile.next();
			dept = readFile.next();
			if(dept.equalsIgnoreCase(super.getDept())) {
				System.out.println(i+")"+name);
				i++;
				check=true;
			}
		}
		
	if(check==false) {
		System.out.println("\nSorry, no department : "+super.getDept()+" in File");
	}
		
	}catch(IOException e) {
		System.out.println("\nSorry, File not found....");
	}
}
}
