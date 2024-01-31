
public class Rectangle extends Shape {
private double width;
private double length;
public Rectangle(double Width, double length,String color) {
	super(color);//call atb color from Constructor method in class Shape
	this.width = width;
	this.length = length;
}
public double getWidth() {
	return width;
}
public double getLength() {
	return length;
}	
@Override
public double getArea() {//implement getArea() abstract medhod from class Shape
	return this.width * this.length;
}
@Override
public String toString() {
	return "Rectangle [Width= "+this.width+"],length=["+this.length+"]"
			+ ",["+super.toString()+"]";
}

}
