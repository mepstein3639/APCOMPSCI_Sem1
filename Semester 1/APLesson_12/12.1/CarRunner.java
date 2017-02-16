import java.util.Scanner;
public class CarRunner
{
	public static void main(String[]args)
	{  
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a paint color prefrence:");
        String p = kb.nextLine();
		System.out.println("Enter an interior preference:");
		String i = kb.nextLine();
		System.out.println("Enter the engine you would like:");
		String e = kb.nextLine();
		System.out.println("Enter your tire preference:");
		String t = kb.nextLine();
		
		Car object = new Car(p, i, e, t);
     
       System.out.print("You Car Contains: \nColor: " + object.getPaint() + " \nInterior: " + object.getInterior() + " \nEngine: " + object.getEngine() + " \nTires: " + object.getTires());
	}
} 