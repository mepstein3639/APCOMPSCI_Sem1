import java.util.Scanner;
public class Sing
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Goodbye", 1);
	}
		public static void sing(String word, int num)
		{
			for(int i = 1; i <= num; i++)
			{
			System.out.print(word + " ");
			}
			System.out.println( );
		}
}