import java.util.Scanner;

public class SubWoofer
{
	public static void main(String []args)
	{
		SubWoofer formula = new SubWoofer();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the height:");
		double h = kb.nextDouble();
		System.out.println("Enter the length:");
		double l = kb.nextDouble();
		System.out.println("Enter the width:");
		double w = kb.nextDouble();
		
		double equation = formula.volume(h, l, w); 
		
		System.out.println("Equation: " + equation);
		
	}
	
	public double volume(double h, double l, double w)
	
	{
		return (h*l*w/(1728));
	}
}