public class Toyota extends Car
{
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
}