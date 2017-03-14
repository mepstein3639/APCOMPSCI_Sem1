public class Toyota implements Location
{
	private double [] location;
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String l)
	{
		location = new double[2];
		String[] loca = l.split(", ");
		location[0] = Double.parseDouble(loca[0]);
		location[1] = Double.parseDouble(loca[1]);
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