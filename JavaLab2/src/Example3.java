import java.text.DecimalFormat;
import java.util.*;//1. import library for input data from keyboard(Console)
public class Example3 {

	public static void main(String[] args) {
        //2. define object for Scanner Class
		Scanner console = new Scanner(System.in);
		//3.Display Text and input data
		System.out.print("Input product name : ");
		String productname = console.nextLine();
		System.out.print("Input product unit : ");
		int productunit = console.nextInt();
		System.out.print("Price per unit     : ");
		float pricePerUnit = console.nextFloat();
		System.out.println();//เว้นบรรทัด
		float totalPrice = pricePerUnit * productunit;
		System.out.println("Total Price is " + totalPrice + " baht.");
		float vat = totalPrice + (totalPrice*7/100);
	    System.out.println("Add  VAT 7% is "+ vat + " baht.");
	   
	}

}
