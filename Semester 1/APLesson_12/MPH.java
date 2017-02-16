import java.lang.Math.*;
public class MPH
{
	private int distance, hours, minutes;
	private double mph;
	
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;	
	}
	
	public MPH(int dist, int hrs, int min)
	{
		distance = dist;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setDistance(int dist)
	{
		distance = dist;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance/(hours + minutes / 60.0));
		return mph;
	}
} 