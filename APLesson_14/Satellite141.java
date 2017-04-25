import java.util.ArrayList;
public class Satellite141
{
   public static void main(String[]args)
   {
       ArrayList<Location141> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda141(honLoc));
       locate.add(new Toyota141("8, 9"));
       locate.add(new GMC141(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";

		for(Location141 l : locate)
		{
			printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
		}	
		printout += "\n\n" + "==========================" ;
       for (Location141 l : locate)
       {
          double xMove = Math.round(((Math.random()*100) + 1) * 100);
		  double yMove = Math.round(((Math.random()*100) + 1) * 100);
		  printout += "\nAfter " + l.getID() + " Moved (" + xMove + "," + yMove +")";
		  ((Car)l).move(xMove, 2*yMove);
		  printout += "\nNew Location (" + getLocation(l.getLoc()) + ")\n\n";
		  
       }


       printout += "\n\n" + "==========================" +
                   "\nDistance from home...";


       for (Location141 l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + Math.round(( getDistance(l.getLoc(), home)* 100.00)/100.00) + ")";
       }


       System.out.println(printout);
   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}