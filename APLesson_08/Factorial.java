import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int n = kb.nextInt();
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n)
	{
		if (n == 1) return 1; 
		return n * factorial(n - 1);
	}
}