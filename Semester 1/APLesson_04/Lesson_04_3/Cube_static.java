import java.util.Scanner; 
public class Cube_static
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side:");
		int side = kb.nextInt();
		double calcSurf;
		print(calcSurf(side));
	}
	
	public static int calcSurf(int side)
	{
		
		return  side * side * 6;
	}
	
	public static void print(double surfacearea)
	{
		System.out.println("The surface area is " + surfacearea +  ".");
	}
}