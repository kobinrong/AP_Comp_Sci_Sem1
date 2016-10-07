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
		
		
		print(num1, num2, num3, average(num1, num2, num3));
		
		
		
	}
	
	public static int average(int num1, int num2, int num3)
	{
		return ((num1 + num2 + num3) / 3);
	}
	
	public static void print(double num1, double num2, double num3, double average)
	{
		System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f", num1, num2, num3, average);
	}	
}