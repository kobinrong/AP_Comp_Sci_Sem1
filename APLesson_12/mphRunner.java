import java.util.Scanner;
public class mphRunner
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours it took to cover the distance. Round down to the nearest hour: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the remaining minutes it took to cover the distance: ");
		int minutes = kb.nextInt();
		double time = hours + (minutes/60);
	
		APLab12_mph vehicle = new APLab12_mph(distance, hours, minutes);
	
	
		System.out.println(distance + " miles per hour in " + time + " hours = " + vehicle.getMPH() + " mph ");
		vehicle.setValues(distance, hours, minutes);
		System.out.println(distance + " miles per hour in " + time + " hours = " + vehicle.getMPH() + " mph ");
	}
}