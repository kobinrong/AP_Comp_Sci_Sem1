import java.util.Scanner;
public class Lab08Center
{
	static String word1;
	static String word2;
	static String word3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first word: ");
		word1 = kb.next();
		makeCenter();
		System.out.println("Please enter your second word: ");
		word2 = kb.next();
		makeCenter();
		System.out.println("Please enter your third word: ");
		word3 = kb.next();
		makeCenter();
		//System.out.println(makeCenter(word1));
		//System.out.println(makeCenter(word2));
		//System.out.println(makeCenter(word3));
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else 
			return makeCenter("  " + word + "  ");
	}
}


//if running code without makeCenter(String word), you will have to put makeCenter() in between 
//every variable word to run the method 