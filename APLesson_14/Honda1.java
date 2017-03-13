public class Honda1 implements Location1 

{
	double x,y;
	
	public Honda1(double[] location)
	{
		this.x = location[0];
		this.y = location[1];
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