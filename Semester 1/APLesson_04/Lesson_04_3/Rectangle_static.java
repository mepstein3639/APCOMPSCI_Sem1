import java.util.Scanner; 
public class Rectangle_static
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length:");
		int l = kb.nextInt();
		System.out.println("Enter width:");
		int w = kb.nextInt();
		double perimeter;
		print(calcPerim(l, w));
	}
	
	public static int calcPerim(int l, int w)
	{
		
		return  2 * (l + w);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("The perimeter is " + perimeter +  " ft around.");
	}
}