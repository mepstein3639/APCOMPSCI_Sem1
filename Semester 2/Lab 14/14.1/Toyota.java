public class Toyota extends Car
{
	private double x, y;
	private double[] locate;
	
	public Toyota(String loc)
	{
		String[] locate = loc.split(", ");
		x = Double.parseDouble(locate[0]);
		y = Double.parseDouble(locate[1]);
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