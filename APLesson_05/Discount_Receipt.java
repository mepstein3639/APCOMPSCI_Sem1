import java.util.Scanner;
public class Discount_Receipt
{
	public static void main(String[]args)
	{
		Discount_Receipt form = new Discount_Receipt();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter item 1: ");
		String item1 = kb.nextLine();
		System.out.println("Enter the price for that item:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter item 2: ");
		String item2 = kb.nextLine();
		System.out.println("Enter the price for that item:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter item 3: ");
		String item3 = kb.nextLine();
		System.out.println("Enter the price for that item:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter item 4: ");
		String item4 = kb.nextLine();
		System.out.println("Enter the price for that item:");
		double price4 = kb.nextDouble();
		
		double subtotal = (price1 + price2 + price3 + price4);
		double discount = dis(subtotal);
		double tax = (subtotal - discount * 0.08);
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<<<<__Reciept__>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		System.out.println("\n");
		
		form.format("Subtotal:" ,subtotal);
		form.format("Discount:" , discount);
		form.format("Tax:" ,tax);
		form.format("Total:" ,total);
		
	
		System.out.println("\n________________________________________");
		System.out.println("* Thank you for your buisness *    -M");
	}
	
	public static double dis(double amount)
	{
		if(amount > 2000)
		{
			return amount * .15;
		}
		
		else
			
		{
			return 0.0;
		}
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n * %10s ........ %10.2f", word, number);
	}	

}