public class Lab091GetOdds	
{
	static int [] numbers = new int[10];
	
	public static void main(String[]args)
	{
		
		fillArray();
		System.out.println("For the following numbers...") ;
		printArray();
		System.out.println("The " + getOdds() + "are odd numbers.");
		
		//fillArray();
		//System.out.println("For the following numbers..." );
		//printArray();
		//System.out.println("These are the odds: " + getOdds());
		//why does the above code not work? 
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int num : numbers)
		{
			System.out.println(num);
		}
	}
	
	public static String getOdds()
	{
		String odds = "";
		for(int num : numbers)
		{
			if((num % 2) == 1)
			{
				odds += (num + " ");
		
			}
		}
		return odds;
	}
}