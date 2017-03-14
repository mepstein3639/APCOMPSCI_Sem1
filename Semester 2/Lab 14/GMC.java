public class GMC implements Location
{
	private double[] location;
	public GMC(double x, double y)
	{
		location = new double[2];
		location[0] = x;
		location[1] = y;
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