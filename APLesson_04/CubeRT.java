import java.util.Scanner;
public class CubeRT
{


	public static int main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the side of your cube");
		int side = keyboard.nextInt();

		print(calcSurf(side));
		
		
		
		
	}
	
	public static void calcSurf(int side)
	{
		return 6 * side * side ; 
	}
	
	public static void print(int sa)
	{
		System.out.println("The surface area of a cube whose sides are" + " " + side + " " + "in length is " + " " + sa);
	}	
}