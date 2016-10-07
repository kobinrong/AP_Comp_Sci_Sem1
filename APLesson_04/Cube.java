import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the side of your cube");
		side = keyboard.nextDouble();

		print();
		calcSurf();
		
		
		
	}
	
	public static void calcSurf()
	{
		sa = 6 * side * side ; 
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are %.2f is %.5f", side,sa);
	}	
}