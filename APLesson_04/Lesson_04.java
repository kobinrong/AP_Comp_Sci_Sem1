public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04(); //object="form"; new instance of class 
		
		String word1 = "wooo";
		double number1 = 4444564.3453;
		
		form.format(word1, number1); //calling a method("format") and then establishing parameters 
		
		String word2 = "yay";
		double number2 = 4534.56;
		
		form.format(word2, number2);
	} //first part of code= car; build object 
	
	
	public void format(String word, double number) //declaring variables 
	{
		System.out.printf("\n%10s  %10.2f", word, number);
	}
	//"alternator of car" ; attach form to object 
}