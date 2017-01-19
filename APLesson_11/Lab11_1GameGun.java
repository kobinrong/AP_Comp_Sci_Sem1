import java.util.Scanner;
public class Lab11_1GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip = new String[CLIPSIZE];
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;

		
		resetClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action: ");
			String action = kb.next();
			if(action.equals("R"))
			{
				reload();
			}
			if(action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
			
		}
		System.out.println("Out of Bullets!!");
		
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount -= 1 ;
			
			return "Boom!!!";
			
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}	
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = " ";
		System.out.println("Bullets:\t" + bulletCount + "\nClip:\t");
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output += clip [i];
		}
		System.out.println(output);
	}
}