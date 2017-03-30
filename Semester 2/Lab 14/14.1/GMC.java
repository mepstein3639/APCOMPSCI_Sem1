public class GMC extends Car
{
	private double x, y;
	
	public GMC(double a, double b)
	{
		x = a;
		y = b;
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
		double[] locate = {x,y};
		return locate;
	}
}