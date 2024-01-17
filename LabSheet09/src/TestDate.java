
public class TestDate {

	public static void main(String[] args) {
     //Test constructor and toString()
		Date d1 =new Date(2023,2,8);
		System.out.print(d1);
		
	 //Test setter and getter
		d1.setYear(2023);
		d1.setMonth(12);
		d1.setDay(21);
		System.out.print(d1);
		System.out.print("Year is "+d1.getYear());
		System.out.print("Month is "+d1.getMonth());
		System.out.print("Day is "+d1.getDay());
		//Test setDate()
		d1.setDate(2024, 1, 2);
		System.out.print("The date of object d1 : "+d1);
	}

}
