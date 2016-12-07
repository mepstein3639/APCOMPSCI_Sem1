import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class KeepComposites
{
	public static void main(String[]args)
	{
		Integer [] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,77,78,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		removePrimes(nums);
		System.out.println("Numbers started out as: 2,6,8,9,10,12,13,15,17,24,55,66,77,78,79");
		System.out.print("Without the prime numbers: " + nums);
	}
	
	public static int gFactor(int n)
	{
		for(int x = 2;x < n; x++)
		{
			if(n % x == 0)
			{
				return 1;
			}
		}
		return 0;
	}
	
	public static ArrayList removePrimes(ArrayList<Integer> nums)
	{
		for(int x = 0; x < nums.size(); x++)
		{
			if(gFactor(nums.get(x)) == 0)
			{
				nums.remove(x);
			}
		}
		return nums;
	}
}