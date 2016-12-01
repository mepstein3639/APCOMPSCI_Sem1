import java.util.Random;
public class BiggestNumber
{
	static int [] array;
	public static void main(String[]args)
	
	{
		array = new int[10];
		fillArray();
		printArray();
		getBiggest();
	}
	
	public static void fillArray()
	{
		Random rand = new Random();
		for(int x = 0; x < 10; x++)
		{
			array[x] = rand.nextInt(100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int arrays:array)
		{
			System.out.println(arrays);
		}
	}
	
	public static void getBiggest()
	{
		int max = 0;
		for(int x = 0; x < 10; x++)
		{
			if(array[x] > max)
			{
				max = array[x];
			}
		}
		System.out.println("The biggest number is " + max);
	}
}