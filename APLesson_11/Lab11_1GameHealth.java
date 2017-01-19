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
			String turn = kb.next();
			int damage =(int)(Math.random() * 2 + 1);
			int amount = (int)(Math.random() * 6 + 1);
			System.out.println(printClip(damage, amount));
			printClip();
		}
		System.out.println("You died!!");
	}
	
	public static void takeDamage(int damage, int amount)
	{
		if(damage = 1)
		{
			healthCount - amount;
			return System.out.println("Taking" + amount + "
		}
		
	}cxx
}
