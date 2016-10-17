import java.util.Scanner;

public class BMICalculator
{
	static double height;
	static double weight;
	static double bmivalue;
	static String bmi; 
	



	public static void main(String[]args)
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height");
		height = kb.nextDouble();
		
		System.out.println("Enter weight");
		weight = kb.nextDouble();
		
		
		
		bmivalue = (calcCond(weight) / ((CalcCond(height)) * (CalcCond(height)))) * 10000;
		
		System.out.println("Your BMI is " + bmivalue);
		System.out.println("Your condition is" + bmi);
		
		
	}
	
	public static double calcCond(String bmi)
	{
		if(bmi < 18.5 )
			return "Underweight";
		else if(18.5 < bmi < 24.9)
			return "normal" ;
		else if(25 < bmi < 29.9)
			return "overweight";
		else if(30.0 < bmi < 34.9)
			return "Obese";
		else if (35 < bmi < 39.9)
			return "Very Obese";
		else if (bmi > 39.9)
			return "Morbidly Obese";
	}
}