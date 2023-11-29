import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		//create object for input data from console(Key board)
		Scanner scan = new Scanner(System.in);
		int currentNum,previousNum;
		
		
		System.out.print("Input number : ");
		previousNum = scan.nextInt();
		
		while(true) {
		System.out.print("Input number : ");
		currentNum = scan.nextInt();
		if(currentNum<previousNum)
		break;
		previousNum=currentNum;}
		
		
		
		System.out.println("\nBye Bye ^o^ ");

	}
	
}
