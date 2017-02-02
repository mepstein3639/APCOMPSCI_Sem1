import java.util.Scanner;
public class DistanceBetween2Runner
{
	public static void main(String[]args)
	{  
		Scanner kb = new Scanner(System.in);
		System.out.println("For the first point point:");
		System.out.println("Enter first X coordinate:");
        int xO = kb.nextInt();
		System.out.println("Enter first Y coordinate:");
		int yO = kb.nextInt();
		System.out.println("For the second point point:");
		System.out.println("Enter second X coordinate:");
		int xT = kb.nextInt();
		System.out.println("Enter second Y coordinate:");
		int yT = kb.nextInt();
		
		Distance object = new Distance(xO, yO, xT, yT);
     
       System.out.print("The Distance between these two points is = " + object.getDistance());
	}
} 

