public class Xbox extends Console 
{
	public Xbox()
	{
		super();
	}
	
	public Xbox(String gsystem)
	{
		super(gsystem);
	}
	
	public String getController()
	{
		return "XBox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "XBox";
	}
}