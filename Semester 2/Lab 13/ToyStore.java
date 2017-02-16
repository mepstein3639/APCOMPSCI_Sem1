import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<>();
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);

			Toy t = getThatToy(name);
			
			if(t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toyList.add(new Car (name));
				if(type.equalsIgnoreCase("AF"))
					toyList.add(new AFigure(name));
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy t : toyList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy t: toyList)
		{
			if(t.getType().equalsIgnoreCase("car"))
			{
				cars ++;
			}
			if(t.getType().equalsIgnoreCase("AFigure"))
			{
				figures ++;
			}
		}
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures > cars)
		{
			return "Action Figures";
		}
		if(figures == cars)
		{
			return "There are equal numbers of Cars and Action Figures";
		}
	return "";
	}
	
	public String toString()
	{
		return toyList.toString();
	}
}