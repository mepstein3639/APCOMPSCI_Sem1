public class Honda extends Car
{
	private double[] location;
	private double x, y;
	
	public Honda(double[] array)
	{
		location = array;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 100000);
	}
	
	public void move(double a, double b)
	{
		x += a;
		y += b;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}