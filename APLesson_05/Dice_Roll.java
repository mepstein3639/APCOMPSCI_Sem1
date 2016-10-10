import java.util.Random;
public class Dice_Roll
{
	public static void main(String[]args)
	{
		int Your = 1 + (int)((Math.random()*6));
		int Computer = 1 + (int)((Math.random()*6));
		System.out.println("You rolled a " + Your);
		System.out.println("The computer rolled a " + Computer);
		
		if(Your > Computer)
		System.out.println("You are the winner!");
	
		if(Your < Computer)
		System.out.println("The Computer is the winner.");
	
		if(Your == Computer)
		System.out.println("Its a tie.");
	}
}