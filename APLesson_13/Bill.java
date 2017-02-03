public class Lesson13
{
	private String name; 
	private double weight, value;
	
	public Bill()
	{
		name = "";
		face = "";
		value = 0;
	}
	
	public Bill(String n, String f, double v)
	{
		name = n; 
		face = f;
		value = v;
	}
	
	public String toString()
	{
		return "Your" + name " is worth $ " + value + ".\n";
	}
}