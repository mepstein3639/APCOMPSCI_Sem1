import java.util.Scanner; 

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = keyboard.nextLine();
		System.out.println("Nice! " + name + " is the stupidest name ever!");
		System.out.println("How old are you " + name + "?");
		int num = keyboard.nextInt();
		System.out.println("Wow. You are really old if you are " + num + ".");
		System.out.println("Changing the subject.");
		keyboard.nextLine();
		System.out.println("What do you do for fun?");
		String fun = keyboard.nextLine();
		System.out.println(fun + " seems really boring....");
		System.out.println("And I'm pretty srue your choice of music is terrible. What dispicable kind do you like?");
		String music = keyboard.nextLine();
		System.out.println(music + " music is for losers. :)");
		System.out.println("How many siblings do you have?");
		int numb = keyboard.nextInt();
		System.out.println(numb + "? That sucks.");
		keyboard.nextLine();
		System.out.println("So what do you want to be when you grow up?");
		String growup = keyboard.nextLine();
		System.out.println("Wow who would ever want to be a " + growup + " when they get older?");
		
	

		
	
	}
}