import java.util.Scanner;

public class ReceiptProgram
{
	public static void main(String[]args)
	{
		ReceiptProgram form = new ReceiptProgram(); //the object 
		
		Scanner keyboard = new Scanner(System.in);
		//prompt user input 
		System.out.println("Please enter item 1");
		String item1 = keyboard.next();
		//prompt user input 
		System.out.println("Please enter price for item 1");
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
		
		
		double subtotal = price1 + price2 + price3;
		double tax = .08 * subtotal; 
		double total = tax + subtotal;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt___>>>>>>>>>>>>>>>");
		form.format(item1,price1);
		form.format(item2, price2);
		form.format(item3,price3);
		System.out.println("\n\n");
		form.format("Subtotal:",subtotal);
		form.format("Tax:",tax);
		form.format("Total:",total);
		System.out.println("_________________________________________");
		System.out.println("* Thank you for your support *");
		
	}
	
	public void format(String item, double price)
	{
	
		System.out.printf("* %10s ........ %10.2f\n", item, price);
	}
}