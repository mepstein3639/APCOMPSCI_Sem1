import java.util.Scanner; 
public class Average_static
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = kb.nextInt();
		System.out.println("Enter number 2:");
		int num2 = kb.nextInt();
		System.out.println("Enter number 3:");
		int num3 = kb.nextInt();
		double perimeter;
		print(calcAvg(num1, num2, num3));
	}
	
	public static int calcAvg(int num1, int num2, int num3)
	{
		
		return  num1 + num2 + num3 / 3;
	}
	
	public static void print(double average)
	{
		System.out.println("The average is " + average +  " .");
	}
}