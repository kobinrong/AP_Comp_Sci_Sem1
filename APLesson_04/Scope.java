import java.util.Scanner;
public class Scope
{
	static String var1 = "Your number are . . . ";
	static int var2;
	static double var3; //nothing is freestanding in java; default= everything is not freestanding t/f need object to be used; show that variables are independent  
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:"); //var2 restricted within these crly brackets so cannot be used in lines 9-12 
		var2 = kb.nextInt(); //initiatlizing declared variable 
		System.out.println("Please enter an double:");
		var3 = kb.nextDouble();
		method1();
	}
	
	public static void method1()
	{
		System.out.println(var1 + var2 + "and" + var3 + ".");
	}
}