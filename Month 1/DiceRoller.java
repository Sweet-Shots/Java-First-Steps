import java.util.Scanner;  // lets us read what the user types
import java.util.Random;  // lets us pick random numbers

public class DiceRoller {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        Random random = new Random();  // tool for random numbers

        int diceCount;  // how many dice the user wants to roll
        int total = 0;  // running total of all dice (starts at 0)

        System.out.println("--- Dice Roller ---");  // print title
        System.out.print("How many dice? (6 sided): ");  // ask how many dice
        diceCount = scanner.nextInt();  // save what they typed

        int dice = 0;  // counter for the loop (starts at 0)
        while (dice < diceCount) {  // keep looping until we've rolled all dice
            dice++;  // increment counter by 1
            int diceNumber = random.nextInt(6) + 1;  // roll a 6-sided die (1-6)
            total = total + diceNumber;  // add this roll to the total
            System.out.println("Die " + dice + ": " + diceNumber);  // print each roll
        }

        System.out.println("Total: " + total);  // print final total

        scanner.close();  // clean up the scanner when done
    }
}