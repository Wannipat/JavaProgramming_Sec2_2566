import java.time.Year;

public class FictionBook implements Author,Book {
private String author_name;
private String email;
private String title;
private int publicYear;

 FictionBook(String title, int publicYear) {
	this.title =title;
	this.publicYear = publicYear;
	return;
}
public void setAuthorName(String name) {
	this.author_name = name;
	
}
public void setEmail(String email) {
	this.email = email;
}
public boolean checkFormatName() {
	String[] name = this.author_name.split(" ");
	String firstname = name[0];
	String lastname = name[1];
	return firstname.length() > 0 && lastname.length() >0;
		
	
}
public String getLastName() {
	String[] name = this.author_name.split(" ");
	String Lastname = name[1];
	return Lastname.toUpperCase();
}
public String getFirstName() {
	String[] name = this.author_name.split(" ");
	String Firstname = name[0];
	return Firstname.toUpperCase();
}
public boolean checkEmail() {
	return this.email.endsWith("@hotmail.com")||this.email.endsWith("@windowslive.com");
}
public String getTitle() {
	return this.title;
}
public int totalPublicYear() {
	return  publicYear = Year.now().getValue() - this.publicYear ;
}
public String toString() {
	return "["+title+"]"+" write by "+"["+getLastName().charAt(0)+"."
+getFirstName()+"("+this.email+")\n"+"Published for "+publicYear+"years.";
}



}
