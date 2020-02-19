// Name : Mikayla Duarte
// Class : CIST 1400-004
// Colleagues : None
// Resources : None

// This class calculates the volume of a donut

public class Donut
{
   public static void main(String[] args)
   {
        
        /****** 
         * for now, we'll use our own value of PI (we'll learn about a built-in version later
         * this semester), so declare a variable to store PI and use the exact value listed in
         * the lab document. Declare the variable so that its value cannot change (i.e., make it
         * a constant/final variable.
         */
      final double pi = 3.1415926535;       
        
        /****** 
         * declare double variables for major radius, minor radius, and number of donuts
         */
      double major_radius;
      double minor_radius;
      double number_of_donuts;
          
        /****** 
         *  declare a variable to store the volume of a single donut
         */
      double volume_single_donut;
         
        /****** 
         * declare a variable to store the volume of all of the donuts
         */
      double volume_all_donuts;
         
        /****** 
         * assign values to the major radius, minor radius, and number of donuts based on 
         * the values in the lab assignment document
         */
      major_radius = 2.75;
      minor_radius = 0.3;
      number_of_donuts = 13.0;
        
        
        /****** 
         * Compute the volume of a single donut into the previously declared variable
         */
      volume_single_donut = (pi * minor_radius * minor_radius) * (2 * pi * major_radius);
         
   
        /****** 
         * Compute the volume of all of the donuts into the previously declared variable
         */
      volume_all_donuts = number_of_donuts * volume_single_donut;
         
        /****** 
         * Print the required information as outlined in the lab document.
         * Make sure your output looks like the output in the assignment sheet, as this is how Web-CAT
         * will need to interpret the output.
         */
      System.out.println("A single donut with major radius " + major_radius + " and minor radius " + minor_radius);
      System.out.println("has a volume of " + volume_single_donut + " while all the donuts have a volume of " + volume_all_donuts);
         
        
   }
}
