import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input title ");
		String title = scanner.nextLine();
		System.out.print("Input year ");
		int year = scanner.nextInt();
		
		FictionBook book = new FictionBook(title,year);
		
		
		System.out.print("Input name ");
		String name = scanner.nextLine();
		System.out.print("Input email ");
		String email = scanner.next();
	
		
		book.setAuthorName(name);
		book.setEmail(email);
	
		while(!book.checkFormatName()) {
			System.out.print("again");
			name = scanner.nextLine();
			book.setAuthorName(name);
		}
		while(!book.checkEmail()) {
			System.out.print("again");
			email = scanner.nextLine();
			book.setEmail(email);
		}
		System.out.println("");
		System.out.print(book.toString());
	}

}
