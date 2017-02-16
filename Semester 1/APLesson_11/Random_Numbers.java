import java.util.Random;
public class Random_Numbers
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[][]nums = new int [4][4];
		
		for(int i = 0; i < nums.length; i++)
		{
			for(int m = 0; m < nums[i].length; m++)
			{
				nums[i][m] = rand.nextInt(100)+1;
				System.out.print(nums[i][m] + "\t");
			}
			System.out.println();
		}
	}
}