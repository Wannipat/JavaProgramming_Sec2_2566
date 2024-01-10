import java.util.*;
public class TestPiggyBank {
    static PiggyBank pb = new PiggyBank();
    static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
/*PiggyBank pb = new PiggyBank();
pb.setPiggyBank(500);
System.out.println("Money Total : " + pb.getTotal());
pb.addTwo (34);
System.out.println("Add 2 Baht Money : " + 34);
System.out.println("Money Total : " + pb.getTotal());
pb.addTen (13);
System.out.println("Add 10 Baht Money : " + 13);
System.out.println("Money Total : " + pb.getTotal());
pb.addFive(100);*/
		sizeofPiggyBank();
		
 }
public static void sizeofPiggyBank() {
		
		System.out.println("Money Total : "+pb.getTotal());
		System.out.print("Please define size of PiggyBank: ");
		//int sizeofPiggyBank = scan.nextInt();
		//pb.setPiggyBank(sizeofPiggyBank);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your Piggy Bank : "+pb.getPiggyBank());
		System.out.println();
		inputCoin();
	} 
public static void inputCoin() {
	while(true) {
		System.out.println("========================================");
		System.out.println("Menu of PiggyBank");
		System.out.println("========================================");
		System.out.println("[1] one baht.");
		System.out.println("[2] two baht.");
		System.out.println("[3] five baht.");
		System.out.println("[4] ten baht.");
		System.out.println("[5] Exit.");
		System.out.println("========================================");
		System.out.print("Please Select Menu [1-5] : ");
		int SelectMenu = scan.nextInt();
		
		if(SelectMenu == 1 ) {
			System.out.print("Insert 1 Baht Monney : ");
			pb.addOne(scan.nextInt());
			System.out.println("My Money Total : "+ pb.getTotal());
		}else if(SelectMenu == 2) {
			System.out.println("Insert 2 Baht Monney : ");
			pb.addOne(scan.nextInt());
			System.out.println("My Money Total : "+ pb.getTotal());
		}else if(SelectMenu == 3) {
			System.out.println("Insert 5 Baht Monney : ");
			pb.addOne(scan.nextInt());
			System.out.println("My Money Total : "+ pb.getTotal());
		}else if(SelectMenu == 4) {
			System.out.println("Insert 10 Baht Monney : ");
			pb.addOne(scan.nextInt());
			System.out.println("My Money Total : "+ pb.getTotal());
		}else if(SelectMenu == 5) {
			System.out.println("BYE BYE ^-^ ");
			break;
			
		}
	}
	
}
}