
public class PersonalInfo {
  private Person name; //object name referrence class Person
  private Date bDay; //object bDay referrence class Date
  //declare 1 private atb
  private int personID;

  //Default constructor
  //Postcondition: firstName"",lastName=""
  //dMonth, day=1, and dYear=1990
  //personID=0
  PersonalInfo(){
	  name = new Person();
	  bDay = new Date();
	  personID = 0;
	  
  }
	//Constructor with parameter
  PersonalInfo(String first,String last, int month,int day,int year,int ID){
	  name = new Person(first,last);
	  bDay = new Date(month,day,year);
	  personID = ID;
  }
	//Medhor to set the personal infomation
  //invoke set method from class Person and class data
  public void setPersonalInfo(String first,String last,int month,int day,int year,int ID) {
	  
	  name.setName(first, last);
	  bDay.setDate(month, day, year);
	  personID = ID;
  }
	//method to return the tring of personal infomation
  public String toString() {
	  return "Name: "+ name.toString()+"\n"+"Date of birth: "+bDay.toString()+"\n"+"PersonalID: "+personID;
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
