import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Receipt form = new Receipt();
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter item 1: ");
		String word1 = keyboard.nextLine();
		System.out.println("Please enter the price for that item:");
		double price1 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 2: ");
		String word2 = keyboard.nextLine();
		System.out.println("Please enter the price for that item:");
		double price2 = keyboard.nextDouble();
		
		keyboard.nextLine();
		System.out.println("Please enter item 3: ");
		String word3 = keyboard.nextLine();
		System.out.println("Please enter the price for that item:");
		double price3 = keyboard.nextDouble();
		
		System.out.println("<<<<<<<<<<<<<<<__Reciept__>>>>>>>>>>>>>>>");
		form.format(word1, price1);
		form.format(word2, price2);
		form.format(word3, price3);
		System.out.println("\n");
		
		double subtotal = (price1 + price2 + price3);
		double tax = (subtotal * 0.08);
		double total = (subtotal + tax);
		form.format("Subtotal:" ,subtotal);
		form.format("Tax:" ,tax);
		form.format("Total:" ,total);
		
		System.out.println("\n________________________________________");
		System.out.println("* Thank you for your buisness *    -M");
	}
	public void format(String word, double number)
	{
		System.out.printf("\n * %10s ........ %10.2f", word, number);
	}
		
		
}