import java.util.*;
public class Toyota implements Location
{
	private double x, y; 
	
	
	public Toyota(String coordinates)
	{
		ArrayList<String> cord = new ArrayList<String>(Arrays.asList(coordinates.split(", ")));
		x = Double.parseDouble(cord.get(0));
		y = Double.parseDouble(cord.get(1));
		
	}
	public int getID()
	{
		return 1 + (int)(Math.random() * 999999);
	}
		
	public void move(int x, int y)
	{
		this.x += x;
		this.y += y;
	}
		
	public double[] getLoc()
	{
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}