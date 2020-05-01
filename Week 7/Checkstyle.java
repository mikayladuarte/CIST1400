// Name : Student Studentson
// Class : CIST1400-123
// Colleagues : Me, Myself, and I
// Resources : The docuements about Checkstyle in Canvas

// Fix all Checkstyle errors in this program and submit to Web-CAT for final score

import java.util.Scanner;

public class Checkstyle 
{

   public static final double TWO_PI = 6.2831853072;
   
   public static void main(String[] args) {

      final int myNumber = 42;
      
      float weirdVariable;
      
      String shortMessage = "This is probably the longest string you will find in the entire program.\n"
         + "You need to split it over several lines using '+' to concatenate it.";
   
      Scanner in = new Scanner(System.in);
   
      int foobar = 42;
      
      System.out.print("Please enter the technical score (0-9): ");
   
      char score = in.next().toUpperCase().charAt(0);
      
      switch (score) 
      {
         case '9':
            System.out.print("Above ");
         case '8':
            System.out.println("Excellent");
            break;
         case '7':
            System.out.print("Above ");
         case '6': case '5':
            System.out.println("Good");
            break;
         case '4':
            System.out.print("Above ");
         case '3': case '2':
            System.out.println("Poor");
         // break; // Checkstyle won't catch logical runtime errors!
         case '1': case '0':
            System.out.println("Participation trophy");
         default:
            System.out.println("Junk score!"); 
      }
   
      boolean done = true;

      if (done) 
      {
         System.out.println("We're inside an if statement!"); 
      }
      else 
      {
         System.out.println("We're inside an else statement!");
      }
         
      for (int xyz = 1; xyz < 10; xyz++) 
      {  
         System.out.printf("Value: %d\n", xyz); 
      }
      
      int yyz = 1;
      
      while (yyz < 10) 
      {
         System.out.println("While loop: " + yyz);
         yyz++;
      }
   }
}