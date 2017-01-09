import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression containing addition, subtraction, multiplication, or division.");
		String expression= kb.nextLine();
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));

		System.out.println(doEquation(equation));
	}
	
	public static ArrayList doEquation(ArrayList<String> equation)
	{
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("*") || equation.get(i).equals("/"))
			{
				if(equation.get(i).equals("*"))
				{
					equation.set(i, ""+(Integer.parseInt(equation.get(i - 1)) * Integer.parseInt(equation.get(i + 1))));
				}
				else
				{
					equation.set(i, ""+(Integer.parseInt(equation.get(i - 1)) / Integer.parseInt(equation.get(i + 1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			}
			else
			{
				i++;
			}	
		}
		i = 0;
		
		while(i < equation.size())
		{
			if(equation.get(i).equals("+") || equation.get(i).equals("-"))
			{
				if(equation.get(i).equals("+"))
				{
					equation.set(i, ""+(Integer.parseInt(equation.get(i - 1)) + Integer.parseInt(equation.get(i+1))));
				}
				else
				{
					equation.set(i, ""+(Integer.parseInt(equation.get(i - 1)) - Integer.parseInt(equation.get(i+1))));
				}
				equation.remove(i - 1);
				equation.remove(i);
			}
			else
			{
				i++;
			}
		}
		return equation;
	}
}