public class Toy
{
	private String name; 
	private int count; 
	
	public Toy()
	{
		name = "Unnamed"; 
		count = 1;
	}
	
	public Toy(String n)
	{
		name = n;
		count = 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count; 
	}
	
	public void setName(String n)
	{
		name = n; 
	}
	
	public void setCount(int c)
	{
		count = c;
	}
	
	public String getType()
	{
		return "something";
	}
	
	public String toString()
	{
		return "Name: " + name + "Count: " + count; 
	}
	
}