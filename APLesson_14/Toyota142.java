import java.util.*;
public class Toyota142 extends Car142
{
	private double x, y; 
	
	
	public Toyota142(String coordinates)
	{
		super();
		this.move(Double.parseDouble(coordinates.split(",")[0]), Double.parseDouble(coordinates.split(",")[1]));
		
	}

}