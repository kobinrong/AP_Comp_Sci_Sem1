import java.lang.Math.*;
import java.util.Scanner;
public class APLab12_mph
{
	private int distance, hours, minutes;
	private double mph;
	
	public APLab12_mph()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public APLab12_mph(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public void setValues(int d, int h, int m)
	{
		distance = d;
		hours = h;
		minutes = m;
		mph = 0;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance/(hours + (minutes/60)));
		return mph;
	}
	
}





