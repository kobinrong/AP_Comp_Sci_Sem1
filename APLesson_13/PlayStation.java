public class PlayStation extends Console 
{
	public PlayStation()
	{
		super();
	}
	
	public PlayStation(String gsystem)
	{
		super(gsystem);
	}
	
	public String getController()
	{
		return "PS DualShock 3";
	}
	
	public String getPlatform()
	{
		return "PlayStation";
	}
}