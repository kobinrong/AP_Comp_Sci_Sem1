import java.util.Scanner;
import java.lang.Math.*;
public class UserClass
{
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public UserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0000000;
	}
	
	public UserClass(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public UserClass(String fName, String lName, String av)
	{
		firstName = fName;
		lastName = lName;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public void getAvatar(String av)
	{
		avatar = av;
	}
	
	public String toString()
	{
		return "Customer Info... \nFirstName: " + firstName +
		"\nLast Name: " + lastName +
		"\nAvatar: " + avatar +
		"\nUser ID#: " + userID;
	}
}

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
