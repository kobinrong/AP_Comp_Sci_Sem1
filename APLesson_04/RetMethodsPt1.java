public class RetMethodsPt1
{
	public static void main(String[]args) 
	{
		//instantiates a new RetMethods object ; now can use volCube object 
		RetMethodsPt1 volCube = new RetMethods();
		int side1 = 3;
		System.out.println(volCube.cube(side1)); //cube object cube method (parameter) 
	}
	
	public int cube(int side) //parameters=side
	{
		return side*side*side;
	}
}