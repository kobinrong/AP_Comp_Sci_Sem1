import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double avg;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first integer");
		 num1 = keyboard.nextInt();
		System.out.println("Please enter the second integer.");
		 num2 = keyboard.nextInt();
		System.out.println("Please enter the third integer.");
		 num3 = keyboard.nextInt();
		average();
		print();
		
		
		
		
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3) / 3;
	}
	
	public static void print()
	{
		System.out.printf("The average of %.2f, %.2f, and %.2f is %.5f", num1, num2, num3, avg);
	}	
}