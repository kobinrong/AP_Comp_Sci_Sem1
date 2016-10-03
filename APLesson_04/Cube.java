import java.util.Scanner;
public class Cube
{
	static int side;
	static double sa;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the side of your cube");
		int side = keyboard.nextInt();

		print();
		calcSurf();
		
		
		
	}
	
	public static void calcSurf()
	{
		sa = 6 * side * side ; 
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube whose sides are" + " " + side + " " + "in length is " + " " + sa);
	}	
}