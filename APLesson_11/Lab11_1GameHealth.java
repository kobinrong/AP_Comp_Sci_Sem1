import java.util.Scanner;
public class Lab11_1GameHealth
{
	static String [] health; 
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
		
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("Your turn! Hit ENTER when ready: ");
			turn = kb.next();
			damage =(int)(Math.random() * 2 + 1);
			amount = (int)(Math.random() * 6 + 1);
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!!");
	}
	
	public static void takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return System.out.println("Taking" + amount + "damage!");
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
		return System.out.println("Power up" + amount );
	}
	
	public static void printClip(int damage, int amount)
	{
		String output = "Health:\t";
		
		for(int i = 0; i <healthCount; i++) 
		{
			if(i < healthCount)
			{	
				health[i] = " @ "; 
			}			
			else
			{
				health[i] = output;
			}	
			
		}
		System.out.println(output);
	}
}
