import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String InputMessage = scan.nextLine();
		if(InputMessage.toUpperCase().toLowerCase().indexOf("nichi") >=0 ) {
			System.out.print("Nichi is a sentence");	
		}else {
			System.out.print(InputMessage);	
		}
	}

}
