import java.util.Scanner;
public class RectangleStaticRT
{


	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of the rectangle.");
		int  l = keyboard.nextInt();
		System.out.println("Please enter the width of the rectangle.");
		int w = keyboard.nextInt();
		
		print(CalcPerim(l,w));
		
	}
	
	public static int CalcPerim(int l, int w)
	{
		return ((2 * l) + (2 * w));
	}
	
public static void print(int perimeter)
	{
		System.out.println("The perimeter of your rectangle is" + " " + perimeter);
	}	
}