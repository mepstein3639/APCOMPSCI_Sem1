public class Honda implements Location
{
	private double [] location;
	public Honda(double[] r)
	{
		location = r;
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999);
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}