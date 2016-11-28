import java.util.Scanner;
public class Lab09ReverseWord
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please input 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		System.out.println("\nIn order... ");
		
		for(String word : words)
		{

			System.out.println(word);
		}
		System.out.println("\nReversed... " );
			reverse(words);
	}
	
	public static void reverse(String [] words)
	{
		
		for(int i = words.length; i > 0; i--)
		{
			System.out.print(words[i-1]);
		}
	}
}