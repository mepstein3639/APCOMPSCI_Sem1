import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like too....." +
							"\n 1. Be a Superhero" +
							"\n 2. Be a Super villan");	
		int a = kb.nextInt();
		if(a == 1)
		{
			System.out.println("Can you....." +
								"\n 1. Fly" +
								"\n 2. Run super fast" );
			int b = kb.nextInt();
			if(b == 1)
			{
				System.out.println("Do you fly around the....." +
								"\n 1. Earth" +
								"\n 2. Space" );
				int c = kb.nextInt();
				if(c == 1)
					{
						System.out.println("You are a Superhero who flys over the earth." +
										"\n******* You are Superman! ********");
					}
					else
					{
						System.out.println("You are a Superhero who flys in space." +
										"\n++++++++ You are an Astronaut. ++++++++");
					}
			}
		     else
			{
					System.out.println("Do you run on....." +
								"\n 1. Land" +
								"\n 2. Water" );
					int d = kb.nextInt();
						if(d == 1)
					{
						System.out.println("You are a Superhero who runs super fast on land." +
										"\n******** You are the Flash! ********");
					}
					else
					{
						System.out.println("You are a Superhero who runs super fast on water." +
										"\n++++++++ You are Jesus. ++++++++");
					}
					
			}
		}
		else
		{	
			System.out.println("Do you have an....." +
							"\n 1. Array of Nukes" +
							"\n 2. Army of Robots" );
			int e = kb.nextInt();
			if(e == 1)
			{
				System.out.println("Do you want to destroy....." +
								"\n 1. Comemrcial area" +
								"\n 2. Residential area" );
				int f = kb.nextInt();
					if(f == 1)
					{
						System.out.println("You are a Super villian who has an array of nukes who destroys commercial buildings." +
										"\n******** You are a smart villian! ********");
					}
					else
					{
						System.out.println("You are a Super villian who has an array of nukes who destroys residential buildings." +
										"\n++++++++ You are a douche. +++++++++");
					}
			}
			else
			{
					System.out.println("Do you want to invade the....." +
									"\n 1. Commercial area" +
									"\n 2. Residential area" );
					int g = kb.nextInt();
						if(g == 1)
					{
						System.out.println("You are a Super villian who has an army of robots who invades commercial buildings." +
										"\n++++++++ You are weird and different then other villians. ++++++++++");
					}
					else
					{
						System.out.println("You are a Super villian who has an army of robots who invades residential buildings." +
										"\n******** I like the way you think! ********");
				}
			}	
		}		
	}
}   