import java.util.*;
public class Lab10ExpSolv
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input an equation");
		String equations = kb.nextLine();	
		ArrayList<String> equation = new ArrayList<String>(Arrays.asList(equations.split(" ")));
		doEquation(equation, equations);
	}	
	
	public static void doEquation(ArrayList<String> equation, String equations)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{	
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				}
				else 
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}			
			i++;
		}
		i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{	
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				}
				else 
				{
					equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i-1);
				equation.remove(i);
			}			
			i++;
		}
		System.out.println(equations + " = " + equation);
	}
	
}
