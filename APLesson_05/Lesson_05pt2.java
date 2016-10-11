import java.util.Random;
public class Lesson_05pt2
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int num = rand.nextInt(3)+1
		; //top of range is not inclusive 
		System.out.println(num);
		
	}
}