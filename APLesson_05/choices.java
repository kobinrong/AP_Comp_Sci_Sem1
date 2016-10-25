public class choices
{
	public static void main(String[]args)
	{
		int number = 200;
		
		if(number > 4)
		{
			System.out.println("It meets one of the conditions.");
			if(number <= 10)
			{
				System.out.println("It meets the two conditions");
			}
		else
			System.out.println("It meets none of the conditions");
		}
	}
}