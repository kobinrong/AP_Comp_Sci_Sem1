public class GameSystem
{
	static String platform;
	static int serialNo;
	
	public  GameSystem()
	{
		platform = " ";
		serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNo = 1 + (int)(Math.random()*9999999);
	}
	
	public getPlatform()
	{
		return platform;
	}	
	
	public getSerialNo()
	{
		return serialNo; 
	}
}