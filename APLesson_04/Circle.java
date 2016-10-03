import java.util.Scanner;
public class Circle
{
	static int r;
	static double area;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the radius of your circle.");
		int r = keyboard.nextInt();

		print();
		calcArea();
		
		
		
	}
	
	public static void calcArea()
	{
		area = 3.14 * r * r ;
	}
	
	public static void print()
	{
		System.out.println("The area of a circle with a radius of" + " " + r + " " + " is " + " " + area);
	}	
}