import java.util.Scanner;

public class ID_Card
{
	public static void main(String[]args)
	{
		ID_Card form = new ID_Card();
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter your first name: ");
		String word1 = keyboard.nextLine();
		System.out.println("Enter your last name: ");
		String word2 = keyboard.nextLine();
		
		System.out.println("Enter your title: ");
		String word3 = keyboard.nextLine();
		System.out.println("Enter your school name: ");
		String word4 = keyboard.nextLine();
		
		System.out.println("Enter your school year: ");
		String word5 = keyboard.nextLine();
		System.out.println("Enter class subject: ");
		String word6 = keyboard.nextLine();
		
		System.out.println("****************************************");
		form.format(word4, word5);
		form.format(word1, word2);
		form.format(word3, word6);
		System.out.println("****************************************");
	}
	public void format(String word1, String word2)
	{
		System.out.printf("* %15s %20s *\n", word1,word2);
	}
		
}