public class TicketDriver 
{
    public static void main(String[]args) 
	{
		Ticket Ty = new Advance(5);
		Ticket Sam = new StudentAdvance(5);
        Ticket Liza = new Walkup();
        System.out.println(Ty);
        System.out.println(Sam);
        System.out.println(Liza);


    }
}