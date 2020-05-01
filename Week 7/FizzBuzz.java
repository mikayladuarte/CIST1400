// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// Demonstrate an understanding of while loops by solving the FizzBuzz problem

import java.util.Scanner;

public class FizzBuzz {
   public static void main(String[] args) {
      // Initialize Scanner Object
      Scanner input = new Scanner(System.in);
      
      // Output FizzBuzz
      System.out.println("FizzBuzz");
      
      // Prompt the user for input
      System.out.print("Enter a non-negative number: ");
      int loopControl = input.nextInt();
      int count = 1;
      
      System.out.println();
      
      // While loop to print out values
      while (loopControl > 0) 
      {
         if (count % 3 == 0 && count % 5 == 0) 
         {
            System.out.println("FizzBuzz");
         }
         else if (count % 3 == 0) 
         {
            System.out.println("Fizz");
         }
         else if (count % 5 == 0)
         {
            System.out.println("Buzz");
         }
         else
         {
            System.out.println(count);
         }
         
         count++;
         loopControl--;
      }      
   }
}