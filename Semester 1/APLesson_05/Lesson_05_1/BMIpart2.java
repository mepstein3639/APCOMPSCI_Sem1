import java.util.Scanner; 
public class BMIpart2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your weight in pounds? ");
		double weight = keyboard.nextInt();
		System.out.println("What is your height in inches?");
		double height = keyboard.nextInt();
		double x = height * height;
		double y = weight / x;
		double z = y * 703;
		System.out.println("Your BMI is " + z + ".");
		double a = calcCondish(z);
	}
	
	public static double calcCondish(double BMI)
	{
		if (BMI <= 18.5)
			 System.out.println("You are anorexic");
		else if (BMI <= 24.9)
			 System.out.println("You are normal");
		else if (BMI <= 25)
			 System.out.println("You are getting there");
		else if (BMI <= 29.9)
			 System.out.println("You are a little big");
		else if (BMI <= 34.9)
			System.out.println("You are sizeable");
		else if (BMI <= 35)
			 System.out.println("You are fat");
		else
			 System.out.println("You're HUGE! -Donald Trump");
		 
		 return 0;
		 
	
	}
}