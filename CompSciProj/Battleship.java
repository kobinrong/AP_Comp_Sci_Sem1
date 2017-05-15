import java.util.Scanner;
public class Battleship
{
	int [] OurShips = new int[15];
	int [] OppShips = new int[15];
	static int healthload = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[healthload];
		
		System.out.println("Enter your ships' coordinates");
		
		for(int i = 0; i < OurShips.length; i++)
		{
			ships[i] = kb.next();
		}
		
		LoadOppShips();
		
		System.out.println("Enter the location for your first shot");
		int firstshot = kb.next();
		
		for(int i = 0; i < OppShips.length; i++)
		{
			if(
		}	
	
		
		
		
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("Your turn! Hit ENTER when ready: ");
			turn = kb.nextLine();
			damage = 1 +(int)(Math.random() * 2);
			amount = 1 + (int)(Math.random() * 6);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!");
	}
	
	public LoadOppShips()
	{
		int [] OppShips = 
	}
	
	public static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "Taking " + amount + " damage!";
		}
		else
		{
			if(healthCount + amount < healthload)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = healthload;
			}
			
		}
		return "Power up " + amount;
	}
	
	public static void printClip()
	{
		String output = "Health:\t";
		
		for(int i = 0; i <healthload; i++) 
		{
			if(i < healthCount)
			{
				
				health[i] = " @ "; 
			}			
			else
			{
				health[i] = " [] "; 
				
			}	
			output += health[i];
		}
		System.out.println(output);
	}
}
