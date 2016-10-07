import java.util.Scanner;
public class CubeRT
{


	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the side of your cube");
		int side = keyboard.nextInt();

		print(side, calcSurf(side));
		
		
		
		
	}
	
	public static int calcSurf(int side)
	{
		return 6 * side * side ; 
	}
	
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are %.2f is %.5f", side, sa);
	}	
}