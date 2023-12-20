import java.util.*;
public class Lab603 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name,separated by a space.\n: ");
		String fullName = scan.nextLine();
		String firstName = "";
		for(int i = 0;i < fullName.length();i++) {
			if(fullName.charAt(i)==' ') {
				firstName = fullName.substring(0,i);
				break;
			}
		}
		String abbreviation = abbreviatName(fullName);
		System.out.print(abbreviation+firstName);
	}
	public static String abbreviatName(String fullName ) {
		String midleName = "";
		String surName ="";
		int space = 0;
		for(int i = 0; i < fullName.length();i++) {
			if(fullName.charAt(i)==' ') {
				space++;
				if(space==1) {
					midleName =fullName.substring(i+1,i+2).toUpperCase()+".";
				}else if(space==2) {
						surName = fullName.substring(i+1,i+2).toUpperCase()+".";
						break;
					}
				}
			}
			return midleName+surName;
			
		}
	} 

