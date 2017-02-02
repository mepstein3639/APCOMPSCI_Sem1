import java.util.Scanner;
public class HumanRunner
{
	public static void main(String[]args)
	{  
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your hair color:");
        String h = kb.nextLine();
		System.out.println("Enter your eye color:");
		String e = kb.nextLine();
		System.out.println("Enter skin color:");
		String s = kb.nextLine();
		
		
		Human object = new Human(h, e, s);
     
       System.out.print("Hello, My name is Michael Epstein. \nMy information: \nHair Color: Black \nEye Color: Brown \nSkin Color: Whitish Tan \n\n");
	   System.out.print("Your Information: \nHair Color: " + object.getHair() + " \nEye Color: " + object.getEyes() + " \nSkin Color: " + object.getSkin());
	}
} 