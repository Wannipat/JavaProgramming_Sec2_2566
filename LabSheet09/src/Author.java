
public class Author {
private String name;
private String email;
private char gender;

public Author(String name, String email,char gender) {
	this.name = name;
	this.email = email;
	this.gender = gender;
}
public Author(String name,String email) {
	this(name, email, ' ');
}
public Author() {
	this("","",' ');
}
public String getName() {
	return name;
}
public String getEmil() {
	return email;
}
public char getGender() {
	return gender;
}
public String getGenderName() {
	if (gender == 'm') {
		return "Male";
	}else if (gender == 'f') {
		return "Female";
	}else
		return null;
	}
public String toString() {
	return "Author name : "+name+" ("+email+"); "+getGenderName();  
}
}
