import java.util.Random;
import java.util.Scanner;
public class GameHealth
{
	static String [] health;
	static int healthLoad = 6;
	static int healthCount;
	public static void main(String[]args)
	{
		Random rand = new Random();
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[healthLoad];
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("Welcome to Epstein's revenge! \nHit enter to start the game: ");
			turn = kb.nextLine();
			damage = rand.nextInt(2) + 1;
			amount = rand.nextInt(6) + 1;
			System.out.println(takeDamage(damage, amount));
			printClip();	
		}
		System.out.println("GAME OVER. \nYou no longer exisit.");
	}
	
	static String takeDamage(int damage, int amount)
	{
		if(damage == 1)
		{
			healthCount -= amount;
			return "You took " + amount + " damage";
		}
		else
		{
			if(healthCount + amount < healthLoad)
			{
				healthCount += amount;
			}
			else
			{
				healthCount = healthLoad;
			}
		}
		return "Power up! You gain " + amount + " health!";
	}
	
	static void printClip()
	{
		String output = ("Health: \t");
		for(int i = 0; i < healthLoad; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ ";
			}
			else
			{
				health[i] = " [] ";
			}
			output += health[i];
		}
		System.out.println(output);
	}
}
