import java.util.Scanner;

public class BMICalculator2
{
	static double height;
	static double weight;
	static double bmi;
	static String condition;
	



	public static void main(String[]args)
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches");
		height = kb.nextDouble();
		
		System.out.println("Enter weight in pounds");
		weight = kb.nextDouble();
		
		
		
		bmi = (weight / (height * height)) * 703;
		System.out.println("Your BMI is " + bmi);
		System.out.println("Your condition is" + condition);
		
	}
	//trickle down from greatest to least 
	public static void calcCond()
	{
		if(bmi > 39.9 )
			condition = "Morbidly Obese";
		else if (bmi > 35)
			condition = "Very Obese";
		else if(bmi > 30)
			condition = "Obese";
		else if(bmi > 25)
			condition = "overweight";
		else if(bmi > 18.5 )
			condition = "normal" ;
		else 
			condition = "Underweight";
		

	}
}