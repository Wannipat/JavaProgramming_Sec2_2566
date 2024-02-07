
import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
	//use buffereader read data from file
		BufferedReader rd = new BufferedReader(new FileReader("d://txtFile//BookData.txt")); //rd == readFile
		
		int countBook = 0,i = 1; // i == number of book
		String tmp = "";
		while((tmp = rd.readLine())!=null) {
			
			String[] data = tmp.split("\t");
			
			System.out.println(i+"."+data[0]+"("+data[1]+"),"+ "Rating "+data[2]+ " publish on "+data[5]);
			countBook++; 
			i++; // i == number of book
		}
		    System.out.println("==================================================================");
		    System.out.println("Total number of book : "+countBook);
            rd.close();
		
		
		
		
		
		
		
		
		
	}

}
