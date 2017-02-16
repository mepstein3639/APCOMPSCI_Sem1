import java.util.Scanner; 

public class Intrest
{
	public static void main(String []args)
	{
		Intrest compoundintrest = new Intrest();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the amount you intend to borrow:");
		double p = kb.nextDouble();
		System.out.println("Enter the Intrest rate:");
		double r = kb.nextDouble();
		System.out.println("Enter the number of times the loan will be compounded per year:");
		double n = kb.nextDouble();
		System.out.println("Enter the life of the loan:");
		double t = kb.nextDouble();
		double a = (1+r/n);
		double g = n * t;
		double h = Math.pow(a, g);
		double w = t * 12;
		double q = p * h / w;
		
		System.out.println("Your amount will equal " + q);
	}
}