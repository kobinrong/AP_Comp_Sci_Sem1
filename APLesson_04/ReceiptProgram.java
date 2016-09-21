import java.util.Scanner;

public class ReceiptProgram
{
	public static void main(String[]args)
	{
		ReceiptProgram form = new ReceiptProgram();
		
		Scanner keyboard = new Scanner(System.in);
		//prompt user input 
		System.out.println("Please enter item 1");
		String item1 = keyboard.next();
		//prompt user input 
		System.out.println("Please enter price for item 1")
		double price1 = keyboard.nextDouble();
		//prompt user input
		System.out.println("Please enter item 2");
		String item2 = keyboard.next();
		//prompt user input
		System.out.println("Please enter price for item 2");
		double price2 = keyboard.nextDouble();
		//prompt user input
		System.out.println("Please enter item 3");
		String item3 = keyboard.next();
		//PROMPT USER INPUT
		System.out.println("Please enter price for item 3");
		double price3 = keyboard.nextDouble();
		
	}
}