import java.text.DecimalFormat;
import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
	final double COMMISSION_RATE = 0.15;
	final int SENTINAL = -1;
	DecimalFormat frm = new DecimalFormat("#,###.00");
	int sales;
	double salary;
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		System.out.print("Enter sales in dollars (or -1 to end):");
		sales = scan.nextInt();
		
		if (sales == SENTINAL)
		{
		System.out.print("BYE");
		break;
		
		}
		salary = 1000 + (sales*COMMISSION_RATE);
		System.out.println("Salary is: "+frm.format(salary));
		
	}
	}

}
