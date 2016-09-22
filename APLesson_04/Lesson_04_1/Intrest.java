import java.util.Scanner; 

public class Intrest
{
	public static void main(String []args)
	{
		Intrest compoundintrest = new Intrest();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the intrest rate:");
		double r = kb.nextDouble();
		System.out.println("Enter the amount you intend to borrow:");
		double p = kb.nextDouble();
		System.out.println("Enter the number of times the loan will be compounded per year:");
		double n = kb.nextDouble();
		System.out.println("Enter the life of the loan:");
		double t = kb.nextDouble();
		double equation = compoundintrest.intrest(r, p, n, t); 
		
		System.out.println("Equation: " + equation);
	}
	
	public double intrest(double r, double p, double n, double t)
	
	{
		return (p*Math.pow(1 + r/n, n * t));
	}
}