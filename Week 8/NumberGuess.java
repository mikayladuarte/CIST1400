// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to prompt the user for a number until they 
// guess the random number generated

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
   public static void main(String[] args) {
   
     // Initialize scanner and random objects
      Scanner input = new Scanner(System.in);
      Random random = new Random();
   
      // Figure out a random number between 1 and 100
      int value = random.nextInt(100) + 1;
      int guess = -1;
      
      // Print the prompt
      System.out.println("Guess the number I'm thinking of!");
   
      // Have the user guess until correct     
      do 
      {
         guess = input.nextInt();
         if (guess > value)
         {
            System.out.printf("Your guess of %d is too high. Try Again!\n", guess);
         }
         
         else if (guess < value) 
         {
            System.out.printf("Your guess of %d is too low. Try Again!\n", guess);
         }
      
      
      } while (guess != value);
   
      // Exit the loop and tell the user they're correct
      System.out.printf("You guessed %d, which is the number I was thinking of!", value);
    
   }
}