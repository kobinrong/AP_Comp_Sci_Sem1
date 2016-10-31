import java.util.Scanner;
public class Lab_061CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the last integer of your sequence: ");
		int n = kb.nextInt();
		System.out.println("Enter the iterating value: ");
		int d = kb.nextInt();
		int i = 1;
		for(i = 1; i <= n; i+=d)
		{
			System.out.print(" " + i);
		}
		
	}
}