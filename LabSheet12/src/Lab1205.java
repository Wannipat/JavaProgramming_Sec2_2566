import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		


	}
	public static String Level(String id) throws IOException{
		BufferedReader rd = new BufferedReader(new FileReader("d://txtFile//Student.txt")); //rd == readFile
		String tmp = "";
		while((tmp = rd.readLine())!=null) {

			String[] data = tmp.split(" ");
			int year = Integer.parseInt(data[0]);
			
			double finalscore = Double.parseDouble(data[5]);
	}
		return tmp;
	}
}
