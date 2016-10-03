import java.util.Scanner;
public class Average
{
	static int num1;
	static int num2;
	static int num3;
	static double avg;

	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first integer");
		int num1 = keyboard.nextInt();
		System.out.println("Please enter the second integer.");
		int num2 = keyboard.nextInt();
		System.out.println("Please enter the third integer.");
		int num3 = keyboard.nextInt();
		
		print();
		average();
		
		
		
	}
	
	public static void average()
	{
		avg = (num1 + num2 + num3) / 3;
	}
	
	public static void print()
	{
		System.out.println("The average of" + " " + num1 + "," + " " + num2 + "," + " " + num3 + "," + " " + "is" + " " + avg);
	}	
}