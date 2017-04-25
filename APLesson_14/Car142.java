public class Car142 implements Location142
{
	int ID; 
	double x, y;
	double [] location;
	
	public Car142()
	{
		x = 0;
		y=0;
		ID = 1+ (int)(Math.random()*999999);
		double[] location = new double[2];
	}
	
	public void move(double a, double b)
	{
		x += a;
		y += b;
	}
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		double [] loc = new double [2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}