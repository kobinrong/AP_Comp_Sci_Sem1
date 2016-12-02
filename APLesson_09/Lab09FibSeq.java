import java.util.Scanner;
public class Lab09FibSeq
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int first = kb.nextInt();
		System.out.println("Please enter your seqence size: ");
		int size = kb.nextInt();
		
		int [] seq = new int[size];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i == 0 || i == 1)
				seq[i] = first;
			else
				seq[i] = seq[i-1] + seq[i-2];
			System.out.println(seq[i] + " ");
		}
		
	}
}