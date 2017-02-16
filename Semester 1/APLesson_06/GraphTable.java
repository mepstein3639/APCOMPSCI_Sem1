import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("This is a multiplication table! ");
		System.out.println("Please enter the columns for the table: ");
		int table = kb.nextInt();
		System.out.println("Please enter a starting integer: ");
		int num = kb.nextInt();
		
		for(int i = 1; i <= table; i++)
		{
			System.out.println(i + "|" + i * num);
		}
	}
}