import java.util.Random;
import java.util.Scanner;
public class User
{
	private String first, last, avatar;
	private int userID;
	
	public User(String fn, String ln)
	{
		first = fn;
		last = ln;
	}
	
	public User(String fn, String ln, String av)
	{
		first = fn;
		last = ln; 
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String setStuff(String fn, String ln, String av)
	{
		first = fn;
		last = ln; 
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
		
		return "";
	}
	
	public String getFirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String getAvatar()
	{
		return avatar;
	}

	public static void main(String[]args)
	{  
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your First Name:");
        String fn = kb.nextLine();
		System.out.println("Enter your Last Name:");
		String ln = kb.nextLine();
		
		User object = new User(fn, ln);
	
		System.out.println("Would you like to use a public avatar? (y or n)");
		String x = kb.nextLine();
		if(x.equals("y"))
		{
			System.out.println("Enter an Avatar Name:");
			String av = kb.nextLine();
			System.out.println("Your Information: \nFirst name: " + object.getFirst() + "\nLast name: " + object.getLast() + "\nAvatar: " + object.getAvatar() + "\nUser ID: " + object.getID());
		}
		else
		{
			System.out.println("Your Information: \nFirst name: " + object.getFirst() + "\nLast name: " + object.getLast() + "\nAvatar: None "+ "\nUser ID: " + object.getID());
		}
	}
} 
	
	