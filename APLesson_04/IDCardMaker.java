import java.util.Scanner;

public class IDCardMaker
{
	public static void main(String[]args)
	{
		IDCardMaker form = new IDCardMaker();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstname = keyboard.next();
		System.out.println("Enter your last name");
		String lastname = keyboard.next();
		System.out.println("Enter your title:");
		String title = keyboard.next();
		System.out.println("Enter the school site:");
		String school = keyboard.next();
		System.out.println("Enter the school year:");
		String year = keyboard.next();
		System.out.println("What is your subject?");
		String subject = keyboard.next();
		
		System.out.println("*************************");
		form.format(school, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		System.out.println("*************************");
	}	
	public void format(String obj1, String obj2)
	{
		System.out.printf("* %10s%10s *", obj1, obj2);
	}
}