public class Money
{
	private String name;
	private double value;
	
	public Money()
	{
		this.name = "";
		this.value = 0;
		this.count = 0;
	}
	
	public Money(String n, double v)
	{
		this.name = n;
		this.value = v;
		this.count = 0;
	}
	
	public abstract String scan();
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getValue()
	{
		return value;
	}
	{
		return "Your " + name + " is worth $" + value + ".\n";
	}
}