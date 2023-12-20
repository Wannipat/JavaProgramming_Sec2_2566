import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputemail();
		

	}//end main
	public static void inputemail() {
		String inputEmail = JOptionPane.showInputDialog("Input E-mail : ").toLowerCase();
		boolean chkEmail = checkEmail(inputEmail);
		displayEmail(chkEmail,inputEmail);

	}
	public static boolean checkEmail(String email) {
		
		if(email.endsWith("hotmail.com")||(email.endsWith("gmail.com"))) {
			return true;

		}else {
			return false;
		}
		//return false;
		
	}//endcheck email
	public static void displayEmail(boolean chkEmail,String inEmail) {
		if(chkEmail==true) {
			JOptionPane.showMessageDialog(null,"Your E-mail is "+inEmail);
		}else {
			JOptionPane.showMessageDialog(null,"Your E-mail is not hotmail or gmail");
		}
	}/*String inputEmail = JOptionPane.showInputDialog("Input E-mail : ").toLowerCase();//รับและแปลงเป็นพิมเล็ก
	//checkEmail;
	boolean checkEmail = checkEmail(inputEmail);

	if(checkEmail==true) {
		
		JOptionPane.showMessageDialog(null,"Your E-mail is "+inputEmail);
	}else {
		JOptionPane.showMessageDialog(null,"Your E-mail is not hotmail or gmail");
	}/*
}
