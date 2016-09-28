import java.util.Scanner; 
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length:");
		length = kb.nextDouble();
		System.out.println("Enter width:");
		width = kb.nextDouble();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
		perimeter = length + length + width + width;
	}
	public static void print()
	{
		System.out.printf("The perimeter is %.5f ft around.\n", perimeter);
	}
}