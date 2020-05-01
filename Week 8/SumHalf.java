//  CIST 1400
//  Lab Practical Starter Code
//  Starter Code
//  Name: Mikayla Duarte
//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class SumHalf
{
   public static void main (String [] args)
   {
      // Print Version
      System.out.println("VERSION: BETA\n");
      
      // Initialize scanner object
      Scanner input = new Scanner(System.in);
      
      // Get input on the number of numbers to be summed
      System.out.print("Enter the number of values to be read: ");
      int num = input.nextInt();
      int halfNum = num / 2;
      int firstHalfSum = 0;
      int secondHalfSum = 0;
      
      // Add numbers for the first half of the values
      for (int i = 0; i < halfNum; i++) 
      {
         System.out.print("Enter a value: ");
         int value = input.nextInt();
         firstHalfSum += value;
      }
      
      // Add numbers for the second half of the values
      for (int i = halfNum; i < num; i++)
      {
         System.out.print("Enter a value: ");
         int value = input.nextInt();
         secondHalfSum += value;
      }
      
      // Print out results
      System.out.println("First: " + firstHalfSum);
      System.out.println("Second: " + secondHalfSum);
      System.out.println("Total: " + (firstHalfSum + secondHalfSum));
      
   }
}