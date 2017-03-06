public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket Mike = new Advance(20);
		Ticket Adam = new Advance(10);
        Ticket John = new StudentAdvance(20);
        Ticket Dave = new StudentAdvance(10);
        Ticket Ryan = new Walkup();

        System.out.println(Mike);
        System.out.println(Adam);
        System.out.println(John);
        System.out.println(Dave);
        System.out.println(Ryan);
	}
}
