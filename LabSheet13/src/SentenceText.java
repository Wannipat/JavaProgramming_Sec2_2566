import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		//creat object for writdata to file using PrintStrem class
		PrintStream writeFile = new PrintStream(new File("D://textFile//sentence.txt"));//PrintStreamเขียนทับของเดิม  //PrintWriterจะต่อท้ายของเดิม
		//Creat object for input data from keyboard
		Scanner sc = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence : ");
			String word = sc.next().toUpperCase();
			
			if(word.equalsIgnoreCase("Stop")) {
				break;
			}
			//Save data to File
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save");
		writeFile.close();
		
	}

}
