import java.util.Scanner;
public class UserMain
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstname = kb.nextLine();
		System.out.println("Please enter your last name: ");
		String lastname = kb.nextLine();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String avaYorN = kb.nextLine();
		if(avaYorN.equalsIgnoreCase("y"))
		{
			System.out.println("Please enter your avatar: ");
			String avaY = kb.nextLine();
			UserMain ph = new UserMain(firstname, lastname, avaY);
			System.out.println();
			System.out.println(ph);
		}
		if(avaYorN.equalsIgnoreCase("n"))
		{
			System.out.println("Thank you.");
			UserMain ph2 = new UserMain(firstname, lastname);
			System.out.println();
			System.out.println(ph2);
		}
	}
	
	
}