import java.util.*;
public class Lab604 {
    static Scanner scan = new Scanner(System.in);//ถ้ากำหนดstaticนอกMethodจะใช้ได้ทั้งclass
    static String studentId,strSubjectId;
    static int subjectId;
	public static void main(String[] args) {
		inputStudent();

	}//end main

	
	public static void inputStudent() {
		do {
			System.out.print("Enter Student Id : ");
			studentId = scan.next();
			
			System.out.print("Enter Subject Id : ");
			subjectId = scan.nextInt();
			
			//covert SubjecId from integer to string (strSubjectId)
			strSubjectId = subjectId+"";
		}while(!(isLength(studentId,strSubjectId)));
		System.out.println();
		displayData(isITStudent(studentId),isITsubject(strSubjectId));
		
	}//end inputStudent
	
	public static boolean isLength(String id,String sub_id) {
		if(id.length()==10 && sub_id.length()==7 ) {
			return true;
		}
		return false;
		
	}//end isLength
	
	public static boolean isITStudent(String id) {
		
		if(id.substring(0,3).equals("211") && id.substring(3,6).equals("311")) {
			return true;
		
		}else {
			return false;
		}
	
	}//end isITStudent
	public static boolean isITsubject(String sub_id) {
		if(sub_id.substring(0,2).equals("21")&& sub_id.subSequence(4,5).equals("1")) {
			return true;
		
		}else {
			return false;
		}
	}
	public static void displayData(boolean sid,boolean subid) {
		if(sid) {
			System.out.println("Student id : "+studentId+" 1st year student in IT");
		}else {
			System.out.println("Student id : "+studentId+" is not year student in IT");
		}
		if(subid) {
			System.out.println("Subject id : "+subjectId+" 1st year student in IT \nEnroll in courses for Year 1");
		}else {
			System.out.println("Subject id : "+subjectId+" 1st year student in IT \nnot enroll in courses for Year 1");
		}
	}//end isITsubject
	
}

