import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Text : ");
		String InputText = scan.nextLine();
		String Text = InputText.replace(" ","");
		boolean pralindrome = true;
		int count = Text.length();
		for(int i = 0; i < count ;i++)
		{
			if(Text.charAt(i) != Text.charAt(count-1-i)) {
				pralindrome = false;
					break;
			}
		}
		if(pralindrome) {
			System.out.print("T : ");
		}else {
			System.out.print("Text : ");
		}
	}

}
