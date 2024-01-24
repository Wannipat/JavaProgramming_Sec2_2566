
public class Customer {
private int id;
private String name;
private int discount;

public Customer(int id,String name,int discount) {
	this.id = id;
	this.name = name;
	this.discount = discount;
}

public String getName() {
	return this.name;
}
public int getDiscount() {
	return discount;
}
public void setDiscount(int discount) {
	this.discount = 0;
}
public String toString() {
	return this.getName()+"("+this.getID()+")"+"("+this.getDiscount()+"%"+")";
}
public int getID() {
	
	return id;
}



}
