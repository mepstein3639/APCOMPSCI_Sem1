import java.util.Scanner;
public class GPA_Calculator
{
	public static void main(String[]args)
	{
		GPA_Calculator form = new GPA_Calculator();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter grade for math: ");
		String math = kb.nextLine();
		System.out.println("Enter grade for science:");
		String science = kb.nextLine();
		System.out.println("Enter grade for english: ");
		String english= kb.nextLine();
		System.out.println("Enter grade for history:");
		String history = kb.nextLine();
		System.out.println("Enter grade for language: ");
		String language = kb.nextLine();
		System.out.println("Enter grade for art:");
		String art = kb.nextLine();
		System.out.println("Enter grade for 7th Period: ");
		String period7 = kb.nextLine();
		
		double gPoints = (calcPoints(science) + calcPoints(math) + calcPoints(english) + calcPoints(history) + calcPoints(language) + calcPoints(art) + calcPoints(period7)) / 7;
		
		System.out.printf("Your GPA is: %.2f" ,gPoints);
	}
	
	public static double calcPoints(String grade)
	
	{
		if (grade.equals("A"))
			
			return 4.0;
			
		if (grade.equals("B"))
			
			return 3.0;
			
		if (grade.equals("C"))
			
			return 2.0;
			
		if (grade.equals("D"))
			
			return 1.0;
			
		if (grade.equals("F"))
			
			return 0.0;
			
			return 0.0;
	}
}