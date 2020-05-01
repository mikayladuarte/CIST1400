import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Initialize scanner and random objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Figure out a random number between 1 and 100
        int value = random.nextInt(100) + 1;
        int guess = -1;

        // Have the user guess until correct     
        do {
            guess = input.nextInt();
            System.out.print("Enter a number between 1 and 100: ");
            if (guess > value)
                System.out.print("Too high. Enter another number: ");

            else if (guess < value)
                System.out.print("Too low. Enter another number: ");


        } while (guess != value);

        // Exit the loop and tell the user they're correct
        System.out.println("Correct, the number was " + value);
    }
}