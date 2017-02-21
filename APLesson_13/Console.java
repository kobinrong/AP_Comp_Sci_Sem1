public abstract class Console extends GameSystem 
{
	public Console()
	{
		super();
	}
	
	
	public Console(String gsystem)
	{
		super(gsystem);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\"" +
				"Serial Number :" + super.getSerialNo() + "\"" +
				"Controller: " + getController() + "\""; 
	}
	
}




