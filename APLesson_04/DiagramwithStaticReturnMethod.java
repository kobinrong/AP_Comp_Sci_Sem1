import java.util.Scanner;
public class DiagramwithStaticReturnMethod
{
public static void main(String[]args)
{
	Scanner keyboard = new Scanner(System.in);
	//variables 
	System.out.println("Please input the length of the rectangle in inches.");
	int l = keyboard.nextInt();
	System.out.println("Please input the width of the rectangle in inches. ");
	int w = keyboard.nextInt();
	print(calcArea(l,w));
	
	// print();
	//calcArea();
	
	
	
	
	
	//method call(parameters)
	
	//print statement 



}
public static int calcArea(int l, int w)
{
	return (l * w) ;
	//use parameters values in calculation 
}
public static void print(int area)
{
	System.out.println("The area of your rectangle is" + area);
}
}