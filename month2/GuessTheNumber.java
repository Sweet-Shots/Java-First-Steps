package month2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int generatedNumber = random.nextInt(10) + 1;
        int guess;

        System.out.println("I'm thinking of a number between 1 and 10!");
        System.out.println("Guess what it is.");

        while (true) {
            try {
                System.out.print("Your guess: ");
                guess = scanner.nextInt();
                if (guess == generatedNumber) {
                    System.out.println("You got it correct!");
                    scanner.close();
                    break;
                }
                else {System.out.println("That IS NOT the number!");}
            } catch (Exception e) {
                System.out.println("That WAS NOT a number!");
                scanner.nextLine();
            }
        }
    }
}
