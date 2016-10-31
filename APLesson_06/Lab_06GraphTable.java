import java.util.Scanner;
public class Lab_06GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int n = kb.nextInt();
		System.out.println("Please enter extent of table:  ");
		int size = kb.nextInt();
		int output = 4 * n + 1 ;
		for(int i = 1; i <= size; i++ )
		{
			System.out.printf("%10s | %10s\n", i, n * i );
		}
		
	}
}