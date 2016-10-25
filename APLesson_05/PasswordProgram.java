import java.util.Scanner;
public class PasswordProgram 

{
	static 	Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		PassCheck();
	}
	
	public static void PassCheck()
	{
		System.out.println("Type in your username:");
		String user = kb.next();
		System.out.println("Type in your password:");
		String pw = kb.next();
		
		if(user.equals("bringback") && pw.equals("harvie"))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(!user.equals("bringback") && pw.equals("harvie"))
				System.out.println("Your user is incorrect");
			if(user.equals("bringback") && !pw.equals("harvie"))
				System.out.println("Your password is incorrect");
		
			else
		{	System.out.println("Your username and password are incorrect!");
			PassCheck();
		}
		}
	}

	
}
