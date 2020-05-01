//  CIST 1400
//  Lab Practical Starter Code
//  Starter Code
//  Name: Mikayla Duarte
//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class Maximum
{
   public static void main (String [] args)
   {
      // Print Version
      System.out.println("VERSION: BETA\n");
      
      // Initialize scanner object
      Scanner input = new Scanner(System.in);
      
      // Initialize variables
      int value = 0;
      
      System.out.print("Enter a value, 1 to quit: ");
      int maxValue = input.nextInt();
      
      do
      {
         System.out.print("Enter a value, 1 to quit: ");
         value = input.nextInt();
         if (value > maxValue && value != 1) 
         {
            maxValue = value;
         }
      } while (value != 1);
      
      System.out.println("\nMaximum: " + maxValue);
   }
}