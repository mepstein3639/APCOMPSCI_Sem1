import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an interger: ");
		int num = kb.nextInt();
		System.out.println("Please enter the number for table: ");
		int table = kb.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			System.out.println(i + "|" + i * num );
		}
	}
}