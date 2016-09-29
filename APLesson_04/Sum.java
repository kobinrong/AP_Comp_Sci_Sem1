public class Sum
{
	public static void main(String[]args)
	{
		
		System.out.println(add(5,5));
	}
	
	public static int add(int one, int two) //method add is not freestanding if no "static" modifier t/f error nonstatic method add cannot be referenced from a static context 
	{
		return one+two;
	}
}