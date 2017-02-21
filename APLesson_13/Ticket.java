public abstract class Ticket
{
	static int serialNo;
	
	public Ticket()
	{
		serialNo = 1000000 + (int)(Math.random() * 9999999);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\n" +
			"Price : " + getPrice();
	}

}


