import java.util.Scanner;
public class Average_Numbers
{
	static int x;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
		
		for(int num : numbers)
		{
			System.out.println(num);
		}
		
		average(numbers);
		System.out.println("The average of these numbers are: " + x/numbers.length);
	}
	
	public static void average(int [] numbers)
	{
		x = 0;
		
		for(int y = 0; y < numbers.length; y++)
		{
			x+=numbers[y];
		}
	}
}