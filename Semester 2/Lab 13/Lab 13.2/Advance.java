public class Advance extends Ticket
{
	private int daysleft;
	
	public Advance(int daysleft)
	{
		this.daysleft = daysleft;
	}
	
	public int getPrice()
	{
		if(daysleft > 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}
