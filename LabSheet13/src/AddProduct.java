import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		//creat object for writdata to file using PrintStrem class
		PrintWriter writeFile = new PrintWriter(new FileWriter("D://textFile//product.txt",true));//PrintStreamเขียนทับของเดิม  //PrintWriterจะต่อท้ายของเดิม มี,true
		//Creat object for input data from keyboard
		Scanner sc = new Scanner(System.in);
		
		//Display and input data from keyboard
		System.out.println("Input product id : ");
		String productID = sc.next();
		System.out.println("Input product Name : ");
		String productName = sc.next();
		System.out.println("Input product Unit : ");
		int productUnit = sc.nextInt();
		System.out.println("Input product Price : ");
		float productPrice = sc.nextFloat();
		
		//Save data to file
		writeFile.println(productID+","+productName+","+productUnit+","+productPrice);
		System.out.print("Save File already....");
		writeFile.close();
	}

}
