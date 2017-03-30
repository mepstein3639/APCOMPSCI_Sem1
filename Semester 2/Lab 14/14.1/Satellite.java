import java.util.ArrayList;

public class Satellite
{
	private static double one, two;
	
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

       double[] home = {0, 0};

       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location l : locate)
       {   
		one = (double)((Math.random()) * 100);
		two = (double)((Math.random()) * 100);
		
		String won = String.format("%.2f" , one);
		String too = String.format("%.2f", two);
		
		
			printout += "\n After " + l.getID() + " moved ("+ won+  ", " + too + ") \n New Location: ("+ getLocation(l.getLoc()) + ") \n";
       }


        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location l : locate)
	   {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc())+ ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] loc)
   {
       return Math.sqrt((Math.pow(loc[0]+one, 2)+ Math.pow(loc[1]+two, 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%.2f, %.2f", loc[0]+one, loc[1]+two);
   }
}
