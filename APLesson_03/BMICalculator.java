import java.util.Scanner; //import Statement

public class BMICalculator
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
	
	//prompt for user input
	System.out.println("This application will calculate your body mass index (BMI) using your height and weight. Please enter the numeric value of your height in centimeters.");
	
	//search for integer value
	double height = keyboard.nextDouble();
	
	//prompt for user input
	System.out.println("Please enter your weight in kilograms.");
	
	//formula for bmi; include 10000 to convert from cm to m
	double weight = keyboard.nextDouble();
	
	double result = (weight / (height * height)) * 10000;
	
	System.out.println("Your BMI is" + " " + result + ".");}
}

	

	
	
	
	

	
	

