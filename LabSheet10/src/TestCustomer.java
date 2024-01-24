public class TestCustomer {
 public static void main(String[] args) {
 System.out.println("###Test Customer class###");
 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
 System.out.print(c1);
 c1.setDiscount(5);
 System.out.print(c1);

 Line();
 System.out.print("id is"+ c1.getID());
 System.out.print("name is :"+c1.getName());
 System.out.print("discount is :" +c1.getDiscount());
 Line();
 System.out.println("###Test Invoice class###");
 Invoice inv1 = new Invoice(101, c1, 12000.00);
 System.out.print(inv1);
 inv1.setAmount(1000);
 System.out.print(inv1);
 Line();
 System.out.print("id is"+ c1.getID());
 System.out.print(c1);
 System.out.print("amount is :" +c1.getDiscount());
 Line();
 System.out.print("id is"+ c1.getID());
 System.out.print("name is :"+c1.getName());
 System.out.print("discount is :"+c1.getDiscount());
 public static void Line() {
	 System.out.print("*****************************");
 
 }
} //end of class()