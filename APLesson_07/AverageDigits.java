import java.util.Scanner;
public class AverageDigits
{
	static int number ;
	static int dig = 0;
	static int av = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + av + ".");
	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			dig += 1;
			av += num %10;
			num /= 10;
			
			av = av/dig;
		}
	}
}