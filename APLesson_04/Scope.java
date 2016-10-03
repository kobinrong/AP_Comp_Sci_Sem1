import java.util.Scanner;
public class Scope
{
	static int l,w;
	static int area;
	 //nothing is freestanding in java; default= everything is not freestanding t/f need object to be used; show that variables are independent  
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length in inches."); //var2 restricted within these crly brackets so cannot be used in lines 9-12 
		int l= kb.nextInt(); //initiatlizing declared variable 
		System.out.println("Please enter the width in inches");
		int w = kb.nextInt();
		
		print(CalcArea(l,w));
	}
	
	public static int CalcArea(int l, int w)
	{
		return (l * w);
	}
	public static void print(int area)
	{
		System.out.println("The area of your rectangle is" + area);
	}	
}