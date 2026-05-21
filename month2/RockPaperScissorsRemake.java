package month2;

import java.util.Scanner;  // lets us read what the user types
import java.util.Random;  // lets us pick random numbers

public class RockPaperScissorsRemake {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        Random random = new Random();  // tool for random numbers

        int robotChoice = random.nextInt(3) + 1;  // computer picks 1, 2, or 3
        int userChoice;  // what the user picks

        System.out.println("--- Rock Paper Scissors ---");  // print title
        System.out.println("1. Rock");  // show option 1
        System.out.println("2. Paper");  // show option 2
        System.out.println("3. Scissors");  // show option 3

        userChoice = getUserChoice(scanner);  // get user's choice from method
         
        String botChoiceName = getBotChoiceName(robotChoice);  // convert number to word

        printResults(userChoice, robotChoice, botChoiceName);  // check and print result

        scanner.close();  // clean up the scanner when done
    }

    public static String getBotChoiceName(int robotChoice) {  // converts 1/2/3 to rock/paper/scissors
        if (robotChoice == 1) return "rock";
        else if (robotChoice == 2) return "paper";
        else return "scissors";
    }

    public static void printResults(int userChoice, int robotChoice, String botChoiceName) {  // prints win/loss/tie
        System.out.println("");
        if ((userChoice == 1 && robotChoice == 3) ||
            (userChoice == 2 && robotChoice == 1) ||
            (userChoice == 3 && robotChoice == 2)) {
            System.out.println("You win!, the bot chose " + botChoiceName);
        } else if (userChoice == robotChoice) {  // both picked the same
            System.out.println("Tie!");
        } else {  // user lost
            System.out.println("You lost, the bot chose " + botChoiceName);
        }
    }

    public static int getUserChoice(Scanner sc) {  // asks user for their choice
        System.out.println("Choice (1-3): ");
        int choice = sc.nextInt();  // save what they typed
        return choice;  // send choice back to main
    }
}
