public class APLab12_1HumanClass
{
	private String hair, eyes, skin;
	
	public APLab12_1HumanClass()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	
	public APLab12_1HumanClass(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(String h, String e, String s)
	
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	public String getEyes()
	{
		return eyes;
	}
	public String getSkin()
	{
		return skin;
	}
}