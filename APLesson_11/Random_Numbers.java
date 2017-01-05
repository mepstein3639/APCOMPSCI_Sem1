import java.util.Random;
public class Random_Numbers
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[][]num = new int [4][4];
		
		for(int i = 0; i < num.length; i++)
		{
			for(int m = 0; m < num[i].length; m++)
			{
				num[i][m] = rand.nextInt(100)+1;
				System.out.print(num[i][m] + "\t");
			}
			System.out.println();
		}
	}
}