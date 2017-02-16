import java.util.Scanner;
public class Lesson_05_2_3
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to do some recursions?");
		String choice = kb.next();
		if(choice.equals("Y") || choice.equals("N"))
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