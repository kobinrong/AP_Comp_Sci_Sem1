public class StudentAdvance extends Advance
{
	public StudentAdvance(int daysLeft)
	{
		super(daysLeft);
		this.daysLeft = daysLeft;
    }

    public int getPrice()
	{
        return super.getPrice()/2;
    }

    
    public String toString() {
        return "Ticket{" +
                "\nserialNumber=" + getSerialNo() +
                "\nPrice=" + getPrice() +
                '}';
    }
}
