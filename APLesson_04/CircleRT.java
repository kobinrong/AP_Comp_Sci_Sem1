import java.util.Scanner;
public class CircleRT
{


	public static int main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the radius of your circle.");
		int r = keyboard.nextInt();

		print(calcArea(r));

		
		
		
	}
	
	public static void calcArea(int r)
	{
		return 3.14 * r * r ;
	}
	
	public static void print(double area)
	{
		System.out.println("The area of a circle with a radius of" + " " + r + " " + " is " + " " + area);
	}	
}