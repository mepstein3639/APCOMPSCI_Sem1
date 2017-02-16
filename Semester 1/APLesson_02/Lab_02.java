public class Lab_02
{
	public static void main(String[]args)
	{
		int l = 16;
		int w = 10;
		int recArea = l * w;
		
		System.out.println("The area of your rectangle is" +" "+ recArea);
		
		String name = "Michael Epstein";
		String address = "1234 Main Street";
		String city = "San Diego, Ca";
		String zipcode = "92130";
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(city);
		System.out.println(zipcode);
		
		int len = 4;
		int wid = 3;
		int hei = 2;
		
		System.out.println("The surface are is " + 2*(wid * hei + len * hei + len * wid));
		
	}
}
