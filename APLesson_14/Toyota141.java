import java.util.*;
public class Toyota141 
{
	private double x, y; 
	
	
	public Toyota141(String coordinates)
	{
		super();
		this.move(Double.parseDouble(coordinates.split(",")[0],Double.parseDouble(coordinates.split(",")[1])));
		
	}

}