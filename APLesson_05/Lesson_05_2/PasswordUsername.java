import java.util.Scanner;
public class PasswordUsername
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		password = h;
		username = f;
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Please type in the password");
		String pass = kb.next();
		System.out.printLine("Please type in the username");
		String user = kb.nextLine();
		if(pass(username) || user(password))
		{
			if(choice.equals("Y"))
				System.out.print("Lets do some recursions!");
			else
				System.out.println("Spoiled the fun!");
		}
		else
		{
			System.out.println("Please enter Y or N");
			recursion();
		}
	}
}