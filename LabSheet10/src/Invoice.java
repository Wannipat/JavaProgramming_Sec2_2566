
public class Invoice {
private int id;
private Customer customer;
private double amount;

public Invoice(int id, Customer customer, double amount) {
	this.id = id;
	this.customer = customer;
	this.amount = amount;
	
}
public int getID() {
	return id;
}

public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
this.customer = customer;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = 0;
}
public int getCustomerID() {
	return getCustomer().getID();
}
public String getCustomerName() {
	return getCustomer().getName();
}
public int getCustomerDiscount() {
	return getCustomer().getDiscount();
}
public double getAmountafterDiscount() {
	return amount*(100 - getCustomer().getDiscount()) / 100;
}
public String toString() {
	return "Invoice[id ="+getCustomer().getID()+","+"customer="+getCustomer().getName()+"("+customer.getID()+")"+"("+customer.getDiscount()+"%)"+",amount="+customer;
}


}