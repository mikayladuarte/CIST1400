//  CIST 1400 Fall 2019
//  Lab Practical #1
//  Starter Code
//  Name: Mikayla Duarte

//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class LabPractical
{
   public static void main (String [] args)
   {
      // Initialize scanner object
      Scanner input = new Scanner(System.in);
      
      // Print Version
      System.out.println("VERSION: RHO");
      
      // Prompt user for full name
      System.out.println("\nEnter your first and last names:");
      String firstName = input.next().toLowerCase();
      String lastName = input.next().toLowerCase();
      
      // Print out the full name
      System.out.printf("\nFull name: %s, %s\n", lastName, firstName);
      
      // Print out the initials
      char firstInitial = firstName.toUpperCase().charAt(0);
      char lastInitial = lastName.toUpperCase().charAt(0);
      System.out.printf("Initials: %c%c\n", firstInitial, lastInitial);
      
      // Prompt user for 2 integer values
      System.out.println("\nEnter first integer: ");
      int num1 = input.nextInt();
      System.out.println("Enter second integer: ");
      int num2 = input.nextInt();
      
      // Print calculations
      System.out.println("\nSum: " + (num1 + num2));
      System.out.println("Product: " + (num1 * num2));
      System.out.printf("Quotient: %.1f\n", (num1 * 1.0 / num2));
      System.out.println("Remainder: " + (num1 % num2));
      System.out.println("Power: " + (Math.pow(num1, num2)));
      
   }
}