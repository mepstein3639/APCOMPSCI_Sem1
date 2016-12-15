import java.util.Random;
public class GetOdds
{
	static int [] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		System.out.println("For the following numbers:");
		fillArray();
		printArray();
		getOdds();
	}
	
	public static void fillArray()
	{
		Random rand = new Random();
		for(int x = 0; x < 10; x++)
		{
			numbers[x] = rand.nextInt(100) + 1;
		}
	}
	
	public static void printArray()
	{
		for(int number : numbers)
		{
			System.out.print("\"" + number + "\", ");
		}
	}
	
	public static void getOdds()
	{
		String odds;
		System.out.printf("\n");
		for(int x = 0; x < 10; x++)
		{
			if ((numbers[x] & 1) == 0)
			{
				System.out.println(numbers[x] + " is even.");
			}
			else
			{
				System.out.println(numbers[x] + " is odd.");
			}
		}
	}
}