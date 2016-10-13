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
	static double A;
	static double B;
	static double C;
	static double D;
	static double F;
	static double gPoints;
	static String gpa;


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
		
		A = 4.0;
		B = 3.0;
		C = 2.0;
		D = 1.0;
		F = 0.0;
	
		gPoints = ((calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(biology) + calcPoints(band) + calcPoints(compsci) + calcPoints(physed)) / 7 );
		
		System.out.println("Your GPA is " + gpa);
		
		
	}
	
	public static double calcPoints()
	{
		if(gpa.equals("A"))
			gPoints = 4.0;
		if(gpa.equals("B"))
			gPoints = 3.0;
		if(gpa.equals("C"))
			gPoints = 2.0;
		if(gpa.equals("D"))
			gPoints = 1.0;
		if(gpa.equals("F"))
			gPoints = 0.0;
	}
}