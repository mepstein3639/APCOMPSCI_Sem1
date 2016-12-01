import java.util.Scanner;
public class Firstletter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("The first letter of your words are: ");
		first(words);
	}
	
	public static void first(String [] words)
	{
		for(String word : words)
		{
			System.out.print("\"" + word.charAt(0) + "\", ");
		}
	}
}