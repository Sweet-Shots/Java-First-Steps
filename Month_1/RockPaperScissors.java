package Month_1;

import java.util.Scanner;  // lets us read what the user types
import java.util.Random;  // lets us pick random numbers

public class RockPaperScissors {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        Random random = new Random();  // tool for random numbers

        int robotChoice = random.nextInt(3) + 1;  // computer picks 1, 2, or 3
        int userChoice;  // what the user picks
        String botChoiceName;  // convert number to word for display

        System.out.println("--- Rock Paper Scissors ---");  // print title
        System.out.println("1. Rock");  // show option 1
        System.out.println("2. Paper");  // show option 2
        System.out.println("3. Scissors");  // show option 3

        System.out.print("Choice (1-3): ");  // ask user to pick
        userChoice = scanner.nextInt();  // save what they typed

        // convert number (1, 2, 3) to word (rock, paper, scissors)
        if (robotChoice == 1) botChoiceName = "rock";
        else if (robotChoice == 2) botChoiceName = "paper";
        else botChoiceName = "scissors";

        // check if user wins - rock beats scissors, paper beats rock, scissors beats paper
        if ((userChoice == 1 && robotChoice == 3) ||
            (userChoice == 2 && robotChoice == 1) ||
            (userChoice == 3 && robotChoice == 2)) {
            System.out.println("You win!, the bot chose " + botChoiceName);  // user won
        } else if (userChoice == robotChoice) {  // both picked the same
            System.out.println("Tie!");  // nobody wins
        } else {  // anything else means user lost
            System.out.println("You lost, the bot chose " + botChoiceName);  // bot won
        }

        scanner.close();  // clean up the scanner when done
    }
}