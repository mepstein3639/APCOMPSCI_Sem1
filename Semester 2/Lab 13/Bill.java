public class Bill extends Money
{
	private String name;
	private String face;
	private double value;

	public Bill()
	{
		super();
		this.face = "";
		
	}
	
	public Bill(Sting n, String f, double v)
	{
		super(n, v);
		this.face = f;
		
	}
	
	public String scan()
	{
		return face;
	}
	
	public String toString()
	{
		return "Face: " + face + "\n" +
		super.toString();
	}
}