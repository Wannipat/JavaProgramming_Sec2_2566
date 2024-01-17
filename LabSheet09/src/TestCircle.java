
public class TestCircle {

	public static void main(String[] args) {
		// Test all constructors and toString()
		 Circle c1 = new Circle(1.1, "blue");
		 System.out.println(c1); // call toString()เรียกผ่านได้เลย
		 System.out.println();
		 
		 //Circle[radius=1.1, color=blue]
		 Circle c2 = new Circle(2.2);//2st Constructor
		 System.out.println(c2);
		 System.out.println();
		 
		 //Circle[radius=2.2, color=red]
		 Circle c3 = new Circle();//1st Constructor
		 System.out.println(c3);
		 System.out.println();
		 //Circle[radius=1.0, color=red]
		 // Test Setters and Getters
		 c1.setRadius(3.3);
		 c1.setColor("Green");
		 System.out.println(c1);
		 System.out.println("The radius of c1 is: "+c1.getRadius());
		 System.out.println("The color of c1 is: "+c1.getColor());
		 
		 //Test getArea() and getCircumference()
		 System.out.printf("THE AREA IS : %.2f%n ", c1.getArea());
		 //%.2f ทศนิยม 2 ตน.
		 System.out.printf("The circumferece is: %.3f", c1.getCircumference());
	}

}
