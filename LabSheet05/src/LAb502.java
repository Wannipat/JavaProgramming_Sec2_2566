import java.util.*;
public class LAb502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence,again : ");
			 sentence = scan.nextLine();
		}
		for(int i = 0; i <= sentence.length();i++) {
			char current = sentence.charAt(i);
			if(current == ' ') {
				System.out.print(sentence.substring(i,sentence.indexOf(' ', i+1)));
				
				
				
			}
		}
	
	}

}
