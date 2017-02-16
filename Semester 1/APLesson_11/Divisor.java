import java.util.Scanner;
import java.util.Random;
public class Divisor
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		int[][]num = new int[4][4];
		for(int i = 0; i < num.length; i++)
		{
			for(int m = 0; m < num[i].length; m++)
			{
				num[i][m] = rand.nextInt(100) + 1;
				System.out.print(num[i][m] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a non-zero number:");
		int divisor = kb.nextInt();
		
		int count = 0;
		for(int i = 0; i < num.length; i++)
		{
			for(int m = 0;m < num[i].length; m++)
			{
				if(num[i][m] % divisor == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the array.");
	}
}