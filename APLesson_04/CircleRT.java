import java.util.Scanner;
public class CircleRT
{


	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the radius of your circle.");
		double r = keyboard.nextDouble();

		print( r, calcArea(r));

		
		
		
	}
	
	public static double calcArea(double r)
	{
		return 3.14 * r * r ;
	}
	
	public static void print(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of %.2f is %.5f", r, area);
	}	
}