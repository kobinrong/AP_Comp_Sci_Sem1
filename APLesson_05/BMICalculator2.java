import java.util.Scanner;

public class BMICalculator2
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
		
		
		
		bmi = (calcCond(weight) / ((CalcCond(height)) * (CalcCond(height)))) * 703;
		bmivalue = (weight / (height * height)) * 703;
		System.out.println("Your BMI is " + bmivalue);
		System.out.println("Your condition is" + bmi);
		
	}
	//trickle down from greatest to least 
	public static double calcCond(String bmi)
	{
		if(bmi > 39.9 )
			return "Morbidly Obese";
		else if (bmi > 35)
			return "Very Obese";
		else if(bmi > 30)
			return "Obese";
		else if(bmi > 25)
			return "overweight";
		else if(bmi > 18.5 )
			return "normal" ;
		else 
			return "Underweight";
		

	}
}