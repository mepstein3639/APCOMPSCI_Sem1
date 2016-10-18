public class Lesson_05_1
{
	public static void main(String[]args)
	{
		String name = "Mike Ep ";
		int units = 1500;
		String category = "";
		
		if(units >= 1000)
			category = " God";
		else if(units >= 500)
			category = " Townsman";
		else if(units >= 100)
			category = " Peasent";
		else
			category = " Trash";
			
			System.out.println(name + "=" + category);
	}
}