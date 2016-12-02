import java.util.Scanner;
public class Lab09FirstLetter
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
		
		System.out.println("\nFirst letters of each word: " );
			first(words);
	
	}
	
	
	public static void first(String [] words)
	{
		
		for(String word : words)
		{
			System.out.print(word.charAt(0) + " ");
		}
}
}
