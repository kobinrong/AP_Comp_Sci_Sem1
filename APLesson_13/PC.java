public PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public String PC(String platform)
	{
		super(platform);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\"" +
				"Serial Number :" + super.getSerialNumber() + "\"" +
				"System Input: " + systemInput() + "\""; 
	}
}