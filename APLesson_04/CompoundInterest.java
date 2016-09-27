import java.util.Scanner;

public class CompoundInterest
{
	public static void main(String[]args) 
	{
		Scanner keyboard = new Scanner(System.in);
		CompoundInterest payment = new CompoundInterest();
		
		
		System.out.println("Please enter the interest rate.");
		double r = keyboard.nextDouble();
		System.out.println("Please enter the original amount you intend to borrow.");
		double P = keyboard.nextDouble();
		System.out.println("Please enter the number of times the loan is compounded per year.");
		double n = keyboard.nextDouble();
		System.out.println("Please enter the number of years for which the loan's interest is calculated.");
		double t = keyboard.nextDouble();
		
		double avg = payment.loan(r,P,n,t);
		
		System.out.printf("Your total monthly payment is%10.2f", avg);
		
	}
	public double loan(double r, double P, double n, double t)
	{
		return (P*(Math.pow(1+r/n, n*t)))/(t*12);
	}
}