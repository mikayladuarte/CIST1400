// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to use Random and SimpleDate to generate random dates

import java.util.Random;

public class Dates 
{
   public static void main(String[] args)
   {
      // Instantiate new SimpleDate objects
      SimpleDate simpleDate = new SimpleDate();
      SimpleDate myBirthday = new SimpleDate(9,24,1994);
      
      // Instantiate new Random object
      Random random = new Random();
      
      // Generate random day, month, and year
      int day = random.nextInt(29) + 1;
      int month = random.nextInt(12) + 1;
      int year = random.nextInt(401) + 1800;
      
      // Print default values for simple date
      System.out.println(simpleDate.toString());
      
      // Print my birthday
      System.out.println(myBirthday.toString());
      
      // Print random numbers generated
      System.out.printf("%d %d %d\n", month, day, year);
      
      // Assign random numbers to simple date object
      simpleDate.setDay(day);
      simpleDate.setMonth(month);
      simpleDate.setYear(year);
      
      // Print new simple date values
      System.out.println(simpleDate.toString());
      
      // Print next day
      simpleDate.nextDay();
      System.out.println(simpleDate.toString());
      
      // Print date 3 days from previous date printed
      simpleDate.nextDay();
      simpleDate.nextDay();
      simpleDate.nextDay();
      System.out.println(simpleDate.toString());
      
      // Print date in dd-mm-yyyy format
      System.out.printf("%d-%d-%d", simpleDate.getDay(), simpleDate.getMonth(), simpleDate.getYear());
      
   }

}