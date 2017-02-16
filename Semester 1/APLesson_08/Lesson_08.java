import java.util.Scanner;
public class Lesson_08
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println(factorial(4));
	}
	public static int factorial(int n)
	{
		if (n == 1) return 1;
		return n * factorial(n-1);
	}
}