public class Lab091GetOdds	
{
	static int [] numbers;
	
	public static void main(String[]args)
	{
		int [] numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers..." + printArray());
		System.out.println("The " + getOdds() + "are odd numbers.");
		
		
	}
	
	public static int fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static int printArray()
	{
		for(int num : numbers)
		{
			System.out.println(num);
		}
	}
	
	public static int getOdds()
	{
		for(int odds : num)
		{
			if( num == odds)
				num += odds ;
			return odds;
		
		}
	}
}