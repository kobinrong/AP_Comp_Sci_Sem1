import java.util.Scanner;
public class Battleship
{
	int [] OurShips = new int[15];
	int [] OppShips = new int[15];
	static int OurHealth = 15;
	static int OppHealth = 15;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 30;
		health = new String[healthload];
		
		System.out.println("Enter your ships' coordinates");
		
		for(int i = 0; i < OurShips.length; i++)
		{
			ships[i] = kb.next();
		}
		
		LoadOppShips();
		
		System.out.println("Enter the location for your shot");
		int OurShot = kb.next();
		
		for(int i = 0; i < OppShips.length; i++)
		{
			if(OurShot = OppShips[i])
			{
				OppHealth -= 1;
				System.out.println("Darn you got me.") 
			}
			else
			{
				System.out.println("Missed!")
			}	
		}	
	
		
	}
	
	public LoadOppShips()
	{
		int [] OppShips = (int)(Math.random() * 100) + 1;
	}
	
	public static String WeTakeDamage(int damage, int OurHealth)
	{
		if(damage == 1)
		{
			--OurHealth;
			return FirstShot + " goes down!";
		}
		if(int [] OurShips = 0)
		{
			return "Game over! Good game!";
		}
		
	}
	
	public static String OppTakesDamage(int damage, int OppHealth)
	{
		if(damage == 1)
		{
			--OppHealth;
			return FirstShot + " goes down!";
		}
		
		if(int [] OppShips = 0)
		{
			return "Game over! You got me; good game!";
		}
	}
	
	
	
	
}
