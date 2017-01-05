public class Lesson_11
{
	public static void main(String[]args)
	{
		int[][]values = new int [4][4];
		
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int m = 0; m < values[i].length; m++)
			{
				values[i][m] = num
				num++;
			}
			
			
		}
		
		
		for(int i = 0; i < values.length; i++)
		{
			for(int m = 0; m < values[i].length; m++)
			{
				System.out.print(values[i][m] + "\t");
			}
			System.out.println();
		}
	}
}