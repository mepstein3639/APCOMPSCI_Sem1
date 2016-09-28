import java.util.Scanner; 
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side:");
		side = kb.nextDouble();
		calcSurf();
		print();
		
	}
	public static void calcSurf()
	{
		sa = side * side * 6;
	}
	public static void print()
	{
		System.out.printf("The surface area is %.5f .\n",sa);
	}
}