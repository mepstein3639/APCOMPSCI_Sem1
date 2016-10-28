import java.util.Scanner;
public class Lesson_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the number of cookies: ");
		int cookies = kb.nextInt();
		int batch = 1;
		for(int needed = cookies; needed > 0; needed -= 25)
		{
			System.out.println("Cookies needed: " + needed);
			System.out.println("Batch #: " + batch);
			batch++;
		}
	}
}