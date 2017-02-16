import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{  
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the Distance:");
        int dist = kb.nextInt();
		System.out.println("Enter the Hours:");
		int hours = kb.nextInt();
		System.out.println("Enter the Minutes:");
		int min = kb.nextInt();
		
		MPH object = new MPH(dist, hours, min);
     
       System.out.print(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH());
	}
} 
