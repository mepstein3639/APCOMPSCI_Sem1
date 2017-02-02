import java.util.Scanner;
public class GameGun
{
	static int bulletCount;
	static int MagSize = 16;
	static int shotCount;
	static String [] Mag;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		Mag = new String[MagSize];
		resetMag();
		
		String action;
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Do you reload (r) or shoot (s)? ");
			action = kb.next();
			if(action.equals("r"))
			{
				reload();
			}
			if(action.equals("s"))
			{
				System.out.println(shoot());
			}
			System.out.println(printMag());
		}
		System.out.println("Out of bullets!");
	}
	static void resetMag()
	{
		for(int i = 0; i < Mag.length; i++)
		{
			Mag[i] = "[]";
		}
	}
	static String shoot()
	{
		if(shotCount > 0)
		{
			Mag[shotCount - 1] = "[]";
			shotCount--;
			return "Bang!";
		}
		else
		{
			return "Reload Soilder!";
		}
	}
	static void reload()
	{
		if(bulletCount >= MagSize)
		{
			bulletCount -= MagSize;
			shotCount = MagSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetMag();
		for(int i = 0; i < shotCount; i++)
		{
			Mag[i] = " * ";
		}
	}
	static String printMag()
	{
		String output = "Bullets: \t" +  bulletCount + "\n" + "Mag: ";
		for(int i = 0; i < MagSize; i++)
		{
			output += Mag[i];
		}
		return output;
	}
}