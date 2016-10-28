import java.util.Scanner;
public class PasswordUsername
{
	public static void main(String[]args)
	{
		PasswordUsername form = new PasswordUsername();
		Scanner kb = new Scanner(System.in);
		
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
				System.out.println("Your username is incorrect.");
			}
			else if (!pass.equals(Password))
			{
				System.out.println("Your password is incorrect.");
			}
			else
			{
				System.out.println("Welcome " + user + "!");
			}
		}
		else
		{
			System.out.println("Please Leave. Both are incorrect!");
		}
	}
}