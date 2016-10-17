import java.util.Scanner;

public class GPACalculator 
{
	static String math;
	static String english;
	static String history;
	static String biology;
	static String band; 
	static String compsci;
	static String physed;

	
	static double gpa;


	public static void main(String[]args)
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter letter grade for math");
		math = kb.next();
		
		System.out.println("Enter letter grade for english");
		english = kb.next();
		
		System.out.println("Enter letter grade for history");
		history = kb.next();
		
		System.out.println("Enter letter grade for biology");
		biology = kb.next();
		
		System.out.println("Enter letter grade for band");
		band = kb.next();
		
		System.out.println("Enter letter grade for compsci");
		compsci = kb.next();
		
		System.out.println("Enter letter grade for physical education");
		physed = kb.next();
		

	
		gpa = (calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(biology) + calcPoints(band) + calcPoints(compsci) + calcPoints(physed)) / 7;
		
		
		System.out.println("Your GPA is " + gpa);
		
		
	}
	
	public static double calcPoints(String gpa)
	{
		if(gpa.equals("A"))
			return 4.0;
		else if(gpa.equals("B"))
			return 3.0;
		else if(gpa.equals("C"))
			return 2.0;
		else if(gpa.equals("D"))
			return 1.0;
		else 
			return 0.0;
	}
}