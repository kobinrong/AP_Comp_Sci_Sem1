import java.util.Scanner;

public class APLab_0502
{
	static String item1;
	static double price1;
	static String item2;
	static double price2;
	static String item3;
	static double price3;
	static String item4;
	static double price4;
	static double discount; 
	static double tax; 
	static double subtotal;
	static double total;
	
	public static void main(String[]args)
	{
		APLab_0502 form = new APLab_0502();
	
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter item 1 ");
		item1 = kb.next();
		System.out.println("Please enter price of item 1");
		price1 = kb.nextDouble();
		
		System.out.println("Please enter item 2 ");
		item2 = kb.next();
		System.out.println("Please enter price of item 2");
		price2 = kb.nextDouble();
		
		System.out.println("Please enter item 3 ");
		item3 = kb.next();
		System.out.println("Please enter price of item 3");
		price3 = kb.nextDouble();
		
		System.out.println("Please enter item 4 ");
		item4 = kb.next();
		System.out.println("Please enter price of item 4");
		price4 = kb.nextDouble();
		
		subtotal = price1 + price2 + price3 + price4; 
		
		discount();
		tax = subtotal * .08; 
		
		total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt___>>>>>>>>>>>>>>>");
		form.format(item1,price1);
		form.format(item2, price2);
		form.format(item3,price3);
		form.format(item4, price4);
		System.out.println("\n\n");
		form.format("Discount:", discount);
		form.format("Subtotal:",subtotal);
		form.format("Tax:",tax);
		form.format("Total:", total);
		System.out.println("_________________________________________");
		System.out.println("* Thank you for your support *");
		
		
	}
	
	public void format(String item, double price)
	{
	
		System.out.printf("* %10s ........ %10.2f\n", item, price);
	}
	
	public static void discount()
	{
		if(subtotal >= 2000)
			discount = subtotal * 0.15 ;
		if(subtotal <= 2000)
			discount = 0 ;
	}
}