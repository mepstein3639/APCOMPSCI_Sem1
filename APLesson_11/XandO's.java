import java.util.Random;
public class Strings
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		String[][]xAndO = new String [4][4];
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int j = 0; j < xAndO[i].length; j++)
			{
				int r =rand.nextInt(2) + 1;
				
				if(r == 1)
				{ 
					xAndO[i][j] = "x";
				}
				else
				{
					xAndO[i][j] = "o";
				}
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}