
public class Person {
//declare 2 private atb
	private String firstName;
	private String lastName;
	
	//Default Constructor
	//Initialize fristName and lastName to an emty String
Person(){
	firstName = "";
	lastName  = "";
}
Person(String first,String last){
	//firstName = first;เหมือนกัน กับ Medhod setName
	//lastName = last;
	setName(first,last);
}
//medhod to set firstName and lastName according to parameter
public void setName(String first, String last) {
	firstName = first;
	lastName = last;
}
public String getFirstName() {
	return firstName;
}
//medhod to return lastname
public String getLastName() {
	return lastName;
}
//method to output the first name and last name
public String toString() {
	return firstName+" "+lastName;
}


}
