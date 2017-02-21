public class TicketDriver 
{
    public static void main(String[]args) 
	{
		Ticket Bob = new Advance(5);
		Ticket Nutty = new StudentAdvance(5);
        Ticket Ryan = new Walkup();

        System.out.println(Bob);
        System.out.println(Nutty);
        System.out.println(Ryan);


    }
}