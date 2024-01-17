
public class Circle {
	//The public constance
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	
//The privet 2 Attributes
	private double radius;
	private String color;
	
	//Constructs a Cicle with default radius and color
	//1st (default) constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
	    this.color = DEFAULT_COLOR;
	}
	//Constructs a Cicle with the given radius and default color
	//2st Constructor
	Circle(double radius){
		this.radius = radius;
	    this.color = DEFAULT_COLOR;
	}
	//Constructs a Cicle with the given radius and = color
	Circle(double radius,String color){
		this.radius = radius;
		this.color = color;
	}
	//return the radius the public getter for private attribute radius
	public double getRadius(){
		return this.radius;
	} 
	// set the radius the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return this.color;
	}
	// set the color the public setter for private variable color
	public void setColor(String color) {
	    this.color = color;
	}
	//return a self descriptive string for a circle
	public String toString() {
		return "Circle[radius = "+radius+",color = "+color+"]";
		
	}
	//return The area of this circle
	public double getArea() {
		return Math.PI * Math.pow(radius,2);
		//return Math.PI * radius * radius;
	}
	//Return the circumference of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}
	
}
