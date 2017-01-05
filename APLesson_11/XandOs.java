import java.util.Random;
public class XandOs
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		String[][]xAndO = new String [4][4];
		
		for(int i = 0; i < xAndO.length; i++)
		{
			for(int m = 0; m < xAndO[i].length; m++)
			{
				int r = rand.nextInt(2) + 1;
				
				if(r == 1)
				{ 
				xAndO[i][m] = "x";
				}
				else
				{
					xAndO[i][m] = "o";
				}
				System.out.print(xAndO[i][m] + "\t");
			}
			System.out.println();
		}
	}
}