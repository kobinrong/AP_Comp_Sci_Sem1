import java.util.Scanner;
public class AverageRT
{


	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first integer");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter the second integer.");
		int num2 = keyboard.nextInt();
		System.out.println("Please enter the third integer.");
		int num3 = keyboard.nextInt();
		
		print(average(num1, num2, num3));
		
		
		
	}
	
	public static int average(int num1, int num2, int num3)
	{
		return ((num1 + num2 + num3) / 3);
	}
	
	public static void print(int average)
	{
		System.out.println("The average of" + " " + num1 + "," + " " + num2 + "," + " " + num3 + "," + " " + "is" + " " + average);
	}	
}