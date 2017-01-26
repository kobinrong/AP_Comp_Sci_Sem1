import java.util.Scanner;
public class CarClassDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the color of you car: ");
		String paint = kb.nextLine();
		System.out.println("Please enter the color of the interior of your car: ");
		String interior = kb.nextLine();
		System.out.println("Please enter the type of engine of your car: ");
		String engine = kb.nextLine();
		System.out.println("Please entire the type of tires for your car: ");
		String tires = kb.nextLine();
	
		APLab12_1CarClass type = new APLab12_1CarClass(paint, interior, engine, tires);
		System.out.println("Your vehicle is ready ...... ");
		System.out.println("Paint: " + type.getPaint() + "\nInterior: " + type.getInterior() + "\nEngine: " + type.getEngine() + "\nTires: " + type.getTires());
	}
}