
/*
 * ⚠️ FULLY AI-GENERATED FILE ⚠️
 *
 * This entire file was generated using AI as part of my Java learning process.
 *
 * It is included for:
 * - Understanding how Java code is structured
 * - Learning how logic and syntax work in practice
 * - Comparing future improvements against generated examples
 *
 * This file may be replaced or rewritten later with my own implementation.
 */

package Month_1;

import java.util.Scanner;  // lets us read user input
import java.util.Random;  // lets us pick random numbers

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();    // tool for making random numbers
        Scanner scanner = new Scanner(System.in);  // tool for reading what you type

        int secretNumber = random.nextInt(100) + 1;  // pick a number from 1-100
        int guess;   // will hold the player's guess
        int attempts = 0;  // counts how many times they've guessed

        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Guess what it is!");

        // keep asking until they get it right
        do {
            System.out.print("Your guess: ");   // ask for their guess
            guess = scanner.nextInt();   // save what they typed
            attempts++;   // add 1 to the attempt counter

            if (guess < secretNumber) {
                System.out.println("Too low!");  // their guess was too small
            } else if (guess > secretNumber) {
                System.out.println("Too high!");  // their guess was too big
            } else {
                System.out.println("Correct! You got it in " + attempts + " guesses.");
            }
        } while (guess != secretNumber);  // if wrong, ask again

        scanner.close();  // clean up the scanner when done
    }
}