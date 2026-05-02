import java.util.Scanner;  // Scanner is a Java class that lets our program read text and numbers typed by the user in the console
import java.util.Random;  // Random is a Java class that lets our program generate random numbers, used here for the robot's choice

// RockPaperScissorsREMADE is the public class for this file - Java requires the file name to exactly match this class name
public class RockPaperScissorsREMADE {
    // main is the entry point of the program: when you run this file, Java looks for this method to start executing
    // 'public' means the method is accessible from anywhere, 'static' means it belongs to the class (not an object instance), 'void' means it returns no value
    // 'String[] args' is an array of text arguments passed to the program when it starts (not used here, but required by Java)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object to read input from the console (System.in)
        Random random = new Random();  // Create a Random object to generate random numbers for the robot's choice

        int robotChoice = random.nextInt(3) + 1;  // Robot picks 1, 2, or 3: nextInt(3) gives 0-2, so +1 adjusts to 1-3
        int userChoice;  // Variable to store the user's choice, which we get from the getUserChoice method next

        System.out.println("--- Rock Paper Scissors ---");  // Print the game title to the console
        System.out.println("1. Rock");  // Show the first option to the user
        System.out.println("2. Paper");  // Show the second option
        System.out.println("3. Scissors");  // Show the third option

        userChoice = getUserChoice(scanner);  // Call our custom method to get the user's choice, pass the Scanner so it can read input
         
        // Old commented out conversion code removed: now handled by getBotChoiceName method
        String botChoiceName = getBotChoiceName(robotChoice);  // Get the word version of the robot's choice using our custom method

        printResults(userChoice, robotChoice, botChoiceName);  // Call our custom method to check and print the game result

        scanner.close();  // Close the Scanner to free up system resources (good practice)
    }

    // Custom method to convert the robot's numeric choice (1, 2, 3) into a readable word ("rock", "paper", "scissors")
    // 'public' = accessible in this class, 'static' = can be called from main without creating a RockPaperScissorsREMADE object
    // 'String' = this method returns a text value, 'int robotChoice' = the numeric choice passed in from main()
    public static String getBotChoiceName(int robotChoice) {
        if (robotChoice == 1) return "rock";
        else if (robotChoice == 2) return "paper";
        else return "scissors";
    }

    // Custom method to check which player won and print the result to the console
    // 'void' = this method does not return any value, it only prints output
    // Parameters: userChoice (int, user's pick), robotChoice (int, robot's pick), botChoiceName (String, robot's pick as word)
    public static void printResults(int userChoice, int robotChoice, String botChoiceName) {
        System.out.println("");
        if ((userChoice == 1 && robotChoice == 3) ||
            (userChoice == 2 && robotChoice == 1) ||
            (userChoice == 3 && robotChoice == 2)) {
            System.out.println("You win!, the bot chose " + botChoiceName);
        } else if (userChoice == robotChoice) {  // Same pick means a tie
            System.out.println("Tie!");
        } else {  // Any other case means the user lost
            System.out.println("You lost, the bot chose " + botChoiceName);
        }
    }

    // Custom method to prompt the user for their choice and return that number
    // 'int' = returns a whole number (1, 2, or 3), 'Scanner sc' = the Scanner passed from main() to read user input
    // We pass the Scanner because it was created in main(), not inside this method - we share it so this method can use it
    public static int getUserChoice(Scanner sc) {
        System.out.println("Choice (1-3): ");  // Print prompt (println adds a newline, so user types on next line)
        int choice = sc.nextInt();  // Read the next integer the user types and store it in 'choice'
        return choice;  // Send the 'choice' value back to the main method that called this
    }
}
