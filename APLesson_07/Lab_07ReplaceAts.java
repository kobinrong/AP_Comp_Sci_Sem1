import java.util.Scanner;
public class Lab_07ReplaceAts
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = kb.nextLine();
		Replace();
		System.out.println("Your new sentence is..." + sentence);
	}
	public static void Replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = (sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1));
		}
		
	}
}