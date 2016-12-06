import java.util.Scanner;
public class Lab091FindtheZs
{
	static String [] words = new String[5];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words: ");
		fillArray();
		System.out.println("Only " + hasZs() + "contain(s) the letter z.");
		
	}
	

	public static String fillArray()
	{


		
		for(int i = 0; i < words.length; i++)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter your words: ");
			words[i] = kb.next();
		}
	}
	
	public static String printArray()
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
			
			if(word.indexof("z") > 0)
			{
				zs += (word + " ");
			}
			return zs;
		}
	}
}
