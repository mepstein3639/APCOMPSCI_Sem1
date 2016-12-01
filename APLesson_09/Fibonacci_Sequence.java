import java.util.Scanner;
public class Fibonacci_Sequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter starting number.");
		int num = kb.nextInt();
		System.out.println("Please enter the sequence size.");
		int size = kb.nextInt();
		int [] seq = new int[size];
		
		for(int x = 0; x < seq.length; x++)
		{
			if(x == 0 || x == 1)
			{
				seq[x] = num;
			}	
			else
			{	
				seq[x] = seq[x - 1] + seq[x - 2];
			}
			
			System.out.print(seq[x] + " ");
		}
	}
}