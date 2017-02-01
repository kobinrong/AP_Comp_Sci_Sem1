import java.util.Scanner;
public class Distance2PointsRunner
{
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Please enter the x location for your first point:");
	int x1 = kb.nextInt();
	System.out.println("Please enter the y location for your first point:");
	int y1 = kb.nextInt();
	System.out.println("Please enter the x location for your second point");
	int x2 = kb.nextInt();
	System.out.println("Please enter the y location for your second point");
	int y2 = kb.nextInt();
	
	Distance2PointsRunner alg = new Distance2PointsRunner(x1, y1, x2, y2);
	
	System.out.println("Distance = " + alg.getDist());
	alg.setValues(4,5,6,7);
	System.out.println("Distance = " + alg.getDist());
	
	}
}