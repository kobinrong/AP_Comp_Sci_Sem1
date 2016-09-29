import java.util.Scanner;

public class SubwooferBoxes
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		SubwooferBoxes vol = new SubwooferBoxes();
		
		System.out.println("Please enter height of box in inches.");
		double h = keyboard.nextDouble();
		System.out.println("Please enter length of box in inches.");
		double l = keyboard.nextDouble();
		System.out.println("Please enter width of box in inches.");
		double w = keyboard.nextDouble();
		
		double cubicInches = h * l * w;
		
		double cubicFeet = vol.calcvol(cubicInches);
		
		System.out.printf("The volume of the box in cubic feet is%10.2f", cubicFeet);
	}
	public double calcvol(double cubicInches)
	{
		return cubicInches / 1728;
	}
}	