import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args) 
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name");
		
		//search for the statement that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Wow," + " " + num + "?" +" " + "You nerd.");
		
	}
}