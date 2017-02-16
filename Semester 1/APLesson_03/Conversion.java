import java.util.Scanner; 

public class Conversion
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the amount of dollars you have? ");
		float dollars = keyboard.nextFloat();
		double x = 0.89;
		double euroes =  dollars * x;
		System.out.println("You have exactly " + euroes + " euores.");
		
	}
}