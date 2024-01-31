
public abstract class Shape {
private String color;
public Shape(String color) {
	this.color = color;
}
Shape() {
	this.color = null; //this.color = null
}

public String toString() {
	return "color= ["+this.color+"]";
}
//abstract medhod
public  abstract double getArea();
}
