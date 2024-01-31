
public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	
	public Rectangle2(double Width, double length) {
		
		this.width = width;
		this.length = length;
	}
	
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}	
	
	public double getArea() {
		return this.width * this.length;
	}
	public String toString() {
		return "Rectangle [Width= "+this.width+"],length=["+this.length+"]"
				+ ",["+"]";
	}

}
