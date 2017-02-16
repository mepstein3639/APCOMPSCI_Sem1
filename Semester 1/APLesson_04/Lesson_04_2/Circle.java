import java.util.Scanner; 
public class Circle
{
	static double radius;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = kb.nextDouble();
		calcArea();
		print();
		
	}
	public static void calcArea()
	{
		area = radius * radius * 3.14;
	}
	public static void print()
	{
		System.out.printf("The area is %.5f.\n", area);
	}
}