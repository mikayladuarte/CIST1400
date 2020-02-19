// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to calculate various text-leveling metrics of a document 
// based on some characteristics

import java.util.Scanner;

public class Text_Metrics {
   public static void main(String[] args) {
      // Create scanner object
      Scanner input = new Scanner(System.in);
      
      // Ask the user for input
      System.out.print("Please enter the number of sentences in the sample: ");
      double numSentences = input.nextDouble();
      
      System.out.print("Please enter the number of words in the sample: ");
      double numWords = input.nextDouble();
      
      System.out.print("Please enter the number of big words in the sample: ");
      double numBigWords = input.nextDouble();
      
      System.out.print("Please enter the number of syllables in the sample: ");
      double numSyllables = input.nextDouble();
      
      System.out.print("Please enter the number of characters in the sample: ");
      double numCharacters = input.nextDouble();
      
      // Gunning Fog Index 
      double gunningFogIndex = 0.4 * ((numWords/numSentences) + 100 * (numBigWords/numWords));
      System.out.printf("\nGunning Fog Index: %.4f\n", gunningFogIndex);
      
      // Reading Ease Score
      double readingEaseScore = 206.835 - 1.015 * (numWords/numSentences) - 84.6 * (numSyllables/numWords);
      System.out.printf("Reading Ease Score: %.4f\n", readingEaseScore);
      
      // SMOG Index Grade Level
      double indexGradeLevel = Math.round(Math.sqrt(numBigWords)/10) + 3;
      System.out.printf("SMOG Index Grade Level: %.0f\n", indexGradeLevel);
      
      // Automated Readability Index
      double readabilityIndex = 4.71 * (numCharacters/numWords) + 0.5 * (numWords/numSentences) - 21.43;
      System.out.printf("Automated Readability Index: %.4f", readabilityIndex);
   }
}