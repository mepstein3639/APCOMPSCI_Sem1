import java.util.Scanner;
public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][]num = new int [4][4];
		for(int i = 0; i < num.length; i++)
		{
			for(int m = 0; m < num[i].length; m++)
			{
				System.out.println("Please enter number #" + ((m + 1) + ((i) * 4))); 
				num[i][m] = kb.nextInt();
			}
		}
		for(int i = 0; i < num.length; i++)
		{
			for(int m = 0; m < num[i].length; m++)
			{
				System.out.print(num[i][m] + "\t");
			}
			System.out.println();
		}
	}
}