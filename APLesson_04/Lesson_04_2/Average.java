import java.util.Scanner; 
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1:");
		num3 = kb.nextDouble();
		System.out.println("Enter number 2:");
		num2 = kb.nextDouble();
		System.out.println("Enter number 3:");
		num3 = kb.nextDouble();
		avg();
		print();
		
	}
	public static void avg()
	{
		average = num1 + num2 + num3 / 3;
	}
	public static void print()
	{
		System.out.printf("The average is %.5f .\n", average);
	}
}