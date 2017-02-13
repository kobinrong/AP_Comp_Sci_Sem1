import java.util.ArrayList;
public class CountingMachine
{
	public static void main(String[]args)
	{
		Money cash = new Money("penny", 2.54, 00.25);
		ArrayList<Money> inventory = new ArrayList<Money>();
		inventory.add(new Coin("Penny", 2.5, 00.01));
		inventory.add(new Coin("Nickel", 2.5, 00.01));
		inventory.add(new Coin("Dime", 2.5, 00.01));
		inventory.add(new Coin("Quarter", 2.5, 00.01));
		inventory.add(new Bill("One", "Washington", 01.00));
		inventory.add(new Bill("Five", "Lincoln", 05.00));
		inventory.add(new Bill("Penny", "Hamilton", 10.00));
		inventory.add(new Bill("Twenty", "Jackson", 20.00));
		inventory.add(new Bill("Hundred", "Franklin", 100));
	
	
		for(Money x : inventory)
		{
			System.out.println(x);
		}
	
	}
}