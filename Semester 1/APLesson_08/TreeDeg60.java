import java.util.Scanner;
public class TreeDeg60
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = kb.next();
	
		int start = 0;
		int stop = word.length();
		tree(word, start, stop);
	}
	
	public static void tree(String word, int start, int stop)
	{
		if(start < stop)
		{
			start++;
			String word2 = "%" + (stop) + "s\n"; 
			System.out.printf(word2, word.substring(0, start));
			tree(word, start, stop);
		}
	}
}