public class Lab091BiggestNum
{
	static int [] array = new array[10];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("The biggest number is ");
		getBiggest();
	}
	
	public static void fillArray()
	{
		for(i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int n : array)
		{
			System.out.println(n);
		}
	}
	
	public static void getBiggest()
	{
		int max = "";
		for(max : n)
		{
			if(n > max)
				n = max;
			
		}
		return max;
	}
}