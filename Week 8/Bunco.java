// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to recreate the Bunco game so that
// we can demonstrate that we can use loops correctly

public class Bunco {
   public static void main(String[] args) {
      
      // Initialize a die object
      Die die = new Die();
      
      // Variables
      int totalScore = 0;
   
      // Print the welcome message
      System.out.println("Welcome to the Bunco Game");
      
      for (int round = 1; round <= 6; round++) 
      {
         boolean endOfRound = false;
         int roundScore = 0;
         
         System.out.println("ROUND " + round);
         
         // Roll until we do not score any points
         do 
         {  
            // Roll 3 dice
            int r1 = die.roll();
            int r2 = die.roll();
            int r3 = die.roll();
            
            // Print what was rolled
            System.out.printf("You rolled a %d and a %d and a %d\n", r1, r2, r3);
            
            // Check if all 3 dice equal each other
            if ((r1 == r2) && (r1 == r3)) 
            {
               // If all 3 dice equal each other but don't equal the round, you get a mini bunco
               if (r1 != round) 
               {
                  System.out.println("MINI-BUNCO!");
                  roundScore += 5;
               } 
               // Score 21 points if all die equal the round
               else 
               {
                  System.out.println("BUNCO!");
                  roundScore += 21;
               }
            }     
                  
            // The round is over when you don't score points
            // Which is when none of the die equal the round and all 3 didn't equal each other
            else if (r1 != round && r2 != round && r3 != round) 
            {
               endOfRound = true;
            }           
            
            // Score 1 point each for die that equal the round number 
            else 
            {                   
               if (r1 == round) 
               {
                  roundScore += 1;
               }         
               if (r2 == round)
               {
                  roundScore += 1;
               }
               if (r3 == round) 
               {
                  roundScore += 1;
               }
            }
            
            // Round is also over when the score is greater than 21
            if (roundScore > 21)
            {
               endOfRound = true;
            }
                           
         } while (!endOfRound);
         
         // Add round score to total score
         totalScore += roundScore;
         
         // Print score for the whole round
         System.out.printf("Your score for round %d is %d\n", round, roundScore);
         
      }
      
      // Print score for the whole game
      System.out.println("Score for all rounds is " + totalScore);
   }
}