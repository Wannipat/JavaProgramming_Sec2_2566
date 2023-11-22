
import java.text.DecimalFormat;
import java.util.*;
public class Homework {
	public static void main(String[] args) {
		    Scanner console = new Scanner(System.in);
		    DecimalFormat frm = new DecimalFormat("#,###.00");
	        System.out.print("Input Product Name   : ");
			String productName = console.nextLine();
	        System.out.print("Input Product Unit   : ");
	        int productUnit = console.nextInt();
	        System.out.print("Input Price per unit : ");
	        float pricePerUnit = console.nextFloat();
	        float totalPrice = productUnit * pricePerUnit;
	        System.out.println("------------------------------------------------");
	        System.out.print("Total Price is "+frm.format(totalPrice)+" baht.\n");
	        System.out.println("------------------------------------------------");
	        System.out.print("How many discount (%) : ");
	        float discountPercen = console.nextFloat();
	        float discountAmount = (discountPercen / 100) * totalPrice;
	        float amountPaid = totalPrice - discountAmount;
	        System.out.println("------------------------------------------------");
	        System.out.print("Discount from "+(int)discountPercen+"%\t"+  frm.format(discountAmount)+" baht\n");// แสดงผลConsole
	        System.out.print("Amount to be paid \t"+frm.format(amountPaid)+" baht");
	        
	        console.close();
	}

}
