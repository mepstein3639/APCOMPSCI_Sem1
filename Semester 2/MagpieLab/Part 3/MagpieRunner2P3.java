import java.util.Scanner;

public class MagpieRunner2P3
{
	public static void main(String[] args)
	{
		Magpie2P3 maggie = new Magpie2P3();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}