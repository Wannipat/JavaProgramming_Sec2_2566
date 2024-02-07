import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException{
		//use Scanner class for input data from keyboard
      Scanner input = new Scanner(System.in);
      
      System.out.print("input section: ");
      int sectionInput = input.nextInt();
      Header();
      showListStudent(sectionInput); //Send sectionInput  to  showListStudent
      
      
	}
	public static void showListStudent(int section) throws IOException{//open file use throws IOException
		BufferedReader rd = new BufferedReader(new FileReader("d://txtFile//List107.txt")); //rd == readFile
		
		String tmp = "";
		while((tmp = rd.readLine())!=null) {

			String[] data = tmp.split("\t");
			int sectionData = Integer.parseInt(data[3]);
			double midtermscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			
			if(sectionData == section) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtermscore+"\t"+finalscore+"\t"+findResult(midtermscore,finalscore));
			}
		}
		
		 rd.close();
		 
	}
	public static String findResult(double midScore,double finScore) {
		
		double totalScore = midScore+finScore;
		/*if(totalScore<=40) {
			return "Fail";
		}else
			return "Pass"; */

		return totalScore<=40?"Fail":"Pass";
	}
	public static void Header() {
		System.out.println("*************************************************************");
		System.out.println("\t\tList of data for section ");
		System.out.println("*************************************************************");
	}
	
	
	
	
	
}
