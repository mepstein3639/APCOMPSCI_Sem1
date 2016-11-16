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
		
		rollDice();
		
		System.out.println("Player rolled a " + Your);
		System.out.println("The computer rolled a " + Computer);
		System.out.println(winner + "is the winner!");
	}
	
	public static void rollDice()
	{
		if(Your > Computer)
		winner = "Player ";
	
		if(Your < Computer)
		winner = "Computer ";
	
		if(Your == Computer)
		winner = "No one ";
	}
}