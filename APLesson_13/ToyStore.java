import java.util.*;
public class ToyStore
{
	static ArrayList<Toy> toylist = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toylist = new ArrayList<>();
	}
	
	public ToyStore(String toy)
	{
		loadToys(toy);
	}
	
	public  void loadToys(String toy)
	{
		
		ArrayList<String>toys= new ArrayList<String> (Arrays.asList(toy.split(", ")));
		for(int i = 0; i < toys.size(); i +=2)
		{
			String name = toys.get(i);
			String type = toys.get(i +1);
			Toy t = getThatToy(name);
			
			if(getThatToy(name) == null)
			{
				if(type.equalsIgnoreCase("Car"))
				{
					Car c = new Car(name);
					toylist.add(c);
				}
				if(type.equalsIgnoreCase("AF"))
				{
					AFigure a = new AFigure(name);
					toylist.add(a);
				}
			}
			else
			{
				
				t.setCount((t.getCount())+1);
			}
		}	
	}
	
	public static Toy getThatToy(String nm)
	{
		for(Toy toy : toylist)
		{
			if(toy.getName().equalsIgnoreCase(nm))
			{
				return toy;
			}
		}
		return null; 
	}
	
	public static String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy toy : toylist)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
				
			}
		}
		return name; 
	}
	
	public static String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		int max = Integer.MIN_VALUE;
		for(Toy toy : toylist)
		{
			if(max < toy.getCount())
			{
				if(toy.getType().equals("Car"))
				{
					cars++;
				}
				if(toy.getType().equals("AF"))
				{
					figures++;
				}
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		else if(figures > cars) 
		{
			return "Action Figures"; 
			
		}
		else 
		{
			return "Equal amounts of actinos figures and cars!";
		}
	}

	public String toString()
	{
		return " " + toylist ;
	}
	
}