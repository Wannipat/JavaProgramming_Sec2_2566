import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Lab1204 {

	public static void main(String[] args)throws IOException {
		BufferedReader rd = new BufferedReader(new FileReader("d://txtFile//BookData.txt")); //rd == readFile
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter rating of book : ");
        double inputrating = sc.nextDouble();
        String tmp = "";
        int count = 0,i=1;
        System.out.println("-------------------------------------");
	}

}
