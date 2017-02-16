import java.util.Scanner; 
public class Circle_static
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = kb.nextInt();
		print(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		
	
		return  r * r * 3.14;
		
	}
	
	public static void print(double area)
	{
		System.out.println("The area of the circle is " + area +  ".");
	}
}