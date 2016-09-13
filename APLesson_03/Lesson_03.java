import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args) 
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI, and I'm going to ask you a few questions.");
		
		System.out.println("What is your name?");
		
		//search for the statement that the user enters
		String name = keyboard.next();
		
		//print the results...
		System.out.println("Wow," + " " + name + "?" +" " + "That name makes me deceased.");
		
		//prompt for user input 
		System.out.println("How old are you?");
		
		//search for the int that user enters
		int num = keyboard.nextInt();
		System.out.println("At" + " " + num + "," + " " + "you should be feeling deceased, too.");
		
		//prompt for user input
		System.out.println("What do you do for fun?");
		
		//search for the statement that the user enters
		String fun = keyboard.next();
		
		//prin the results
		System.out.println("You live such an unfortunate existence doing" + " " + fun + ".");
		
		//prompt for user input
		System.out.println("What kind of music do you like?");
		
		//search for the satement that the user enters
		String music = keyboard.next();
		
		//print the results
		System.out.println("I'd probably bleed from my ears if I listened to" + " " + music + "." );
		
		//prompt for user input
		System.out.println("How many siblings do you have?");
		int numSiblings = keyboard.nextInt();
		
		System.out.println("You have" + " " + numSiblings + "?" + " " + "No wonder you're so messed up.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String Career = keyboard.next();
		
		System.out.println("Yikes! Good luck with becoming a" + " " + Career + "." + " " + "lol! ");
		
	}
}