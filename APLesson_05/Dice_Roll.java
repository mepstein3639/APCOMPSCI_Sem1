import java.util.Random;
public class Dice_Roll
{
	static int Your;
	static int Computer;
	static String winner;
	
	public static void main(String[]args)
	{
		int Your = 1 + (int)((Math.random()*6));
		int Computer = 1 + (int)((Math.random()*6));
	
		System.out.println("Player rolled a " + Your);
		System.out.println("The computer rolled a " + Computer);
			
		System.out.println(rollDice(Your, Computer) + "is the winner!");
	}
	
	public static String rollDice(int Your, int Computer)
	{
		if(Your > Computer)
		{
		return "Player ";
		}
		if(Your < Computer)
		{
		return "Computer ";
		}
		else
		{
		return "No one ";
		}
	}
}