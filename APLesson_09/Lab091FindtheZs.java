import java.util.Scanner;
public class Lab091FindtheZs
{
	static String [] words = new String[5];
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter your words: ");
		fillArray();
		System.out.println("For the words: ");
		printArray();
		System.out.println("Only " + hasZs() + "contain(s) the letter z.");
		
	}
	

	public static void fillArray()
	{
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
	}
	
	public static void printArray()
	{
		for(String print : words)
		{
			System.out.println(print);
		}
	}
	
	public static String hasZs()
	{
		String zs = " ";
	
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += (word + " ");
			}
		}
		return zs;
	}
}
