public class GameRunner 
{
	public static void main(String[]args)
	{
      GameSystem Comp = new PC("PC");
       Console Xbox = new Xbox("Xbox");
      Console PS4 = new PlayStation("PlayStation 4 Pro");
        System.out.println(Comp);
        System.out.println(Xbox);
        System.out.println(PS4);
	}
}

