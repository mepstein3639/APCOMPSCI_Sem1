import java.util.Scanner; 

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your weight in pounds? ");
		float weight = keyboard.nextInt();
		System.out.println("What is your height in inches?");
		float height = keyboard.nextInt();
		float x = height * height;
		float y = weight / x;
		float z = y * 703;
		System.out.println("Your BMI is " + z + ".");
		

	}
}