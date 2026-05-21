package month1;

import java.util.Scanner;  // lets us read what the user types

public class Calculator {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        int firstNumber;  // the first number they enter
        int secondNumber;  // the second number they enter
        int choice;  // which math operation they want

        System.out.println("--- Calculator ---");  // print title
        System.out.println("1. Add");  // show option 1
        System.out.println("2. Subtract");  // show option 2
        System.out.println("3. Multiply");  // show option 3
        System.out.println("4. Divide");  // show option 4

        System.out.print("Choose (1-4): ");  // ask them to pick
        choice = scanner.nextInt();  // save what they typed

        System.out.print("First Number: ");  // ask for first number
        firstNumber = scanner.nextInt();  // save what they typed

        System.out.print("Second Number: ");  // ask for second number
        secondNumber = scanner.nextInt();  // save what they typed

        if (choice == 1) {  // if they chose 1
            System.out.println("Result: " + (firstNumber + secondNumber));  // add them together
        } else if (choice == 2) {  // if they chose 2
            System.out.println("Result: " + (firstNumber - secondNumber));  // subtract second from first
        } else if (choice == 3) {  // if they chose 3
            System.out.println("Result: " + (firstNumber * secondNumber));  // multiply them
        } else if (choice == 4) {  // if they chose 4
            System.out.println("Result: " + (firstNumber / secondNumber));  // divide first by second
        } else {  // if they typed something else
            System.out.println("Invalid choice.");  // tell them that wasn't valid
        }

        scanner.close();  // clean up the scanner when done
    }
}