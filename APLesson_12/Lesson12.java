
public class Lesson12
{
	//instance variables 
	private String userName, firstName, lastName; 
	
	//Default Constructor
	public Lesson12()
	{
		userName = "";
		firstName = "";
		lastName = "";
		
	}
	
	//Constructor with params 
	public Lesson12(String uName, String fName, String lName)
	{
		userName = uName;
		firstName = fName; 
		lastName = lName; 
		
	}
	
	//Modifier
	public void setUserName(String uName)
	{
		userName = uName; 
	}
	
	//Accessors 
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName; 
	}
	
	public String getLastName()
	{
		return lastName; 
	}
	
	public static void main (String[]args)
	{
		Lesson12 object = new Lesson12("profHandsome","Professor", "Handsome");
		
		System.out.println("<<<<<<<<<< user info >>>>>>>>>>>>>");
		System.out.println("Name: " + object.getFirstName() + object.getLastName());
		System.out.println("User Name: " + object.getUserName());
	}
}