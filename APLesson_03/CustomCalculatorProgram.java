import java.util.Scanner; //import Statement

public class CustomCalculatorProgram
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		//prompt user input 
		System.out.println("I can multiply really large numbers... but not too large, haha! Give me a number.");
		
		int First = keyboard.nextInt();
		
		System.out.println("Cool, give me the other number.");
		
		int Second = keyboard.nextInt();
		int Result = First * Second;
		System.out.println("The product of" + " " + First + " " + "and" + " " + Second + " " + "is" + " " + Result + ".");
		
		
	}
}