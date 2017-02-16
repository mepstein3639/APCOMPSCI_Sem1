import java.util.Scanner;
public class PasswordUsername
{
	static Scanner kb;
	public static void main(String[]args)
	{
		PasswordUsername form = new PasswordUsername();
		 kb = new Scanner(System.in);
		 recursion();
	}
		public static void recursion()
		{
			
		System.out.println("Enter the username: ");
		String user = kb.nextLine();
		System.out.println("Enter the password: ");
		String pass = kb.nextLine();
		String Username = "michael";
		String Password = "epstein";
	
		if (user.equals(Username)|| pass.equals(Password))
		{
			if (!user.equals(Username))
			{
				System.out.println("Your username is incorrect. Please try again.");
				recursion();
			}
			else if (!pass.equals(Password))
			{
				System.out.println("Your password is incorrect. Please try again.");
				recursion();
			}
			else
			{
				System.out.println("Welcome " + user + "!");
			}
		}
		else
		{
			System.out.println("Please try again. Both are incorrect!");
			recursion();
		}
		
	}
}