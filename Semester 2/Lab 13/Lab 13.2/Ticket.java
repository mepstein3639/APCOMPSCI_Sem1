public abstract class Ticket
{
	private int serialNo;
	
	public Ticket()
	{
		this.serialNo = 1 + (int)(Math.random()*9999999);
	}

	public int getserialNo()
	{
		return serialNo;
	}	
	
	public abstract int getPrice();
	
	public String toString() 
	{
        return "\n=======================\n Serial Number: " + getserialNo() + "\n" +
                " Price: " + getPrice() + "\n=======================";
    }
	
}