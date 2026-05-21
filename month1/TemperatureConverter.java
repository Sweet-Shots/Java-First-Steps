package month1;

import java.util.Scanner;  // lets us read what the user types

public class TemperatureConverter {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        double temperature;  // the temperature they enter (can have decimals)
        double result;  // the converted result (can have decimals)
        int choice;  // which conversion they want

        System.out.println("--- Temperature Converter ---");  // print title
        System.out.println("1. Fahrenheit (F) to Celsius (C)");  // show option 1
        System.out.println("2. Celsius (C) to Fahrenheit");  // show option 2

        System.out.print("Choice (1-2): ");  // ask them to pick
        choice = scanner.nextInt();  // save what they typed

        if (choice == 1) {  // if they chose 1
            System.out.print("Enter temperature in Fahrenheit: ");  // ask for temp
            temperature = scanner.nextInt();  // save what they typed
            result = (temperature - 32) * 5.0 / 9.0;  // convert F to C
            System.out.println("Result: " + result + "C");  // show result
        } else if (choice == 2) {  // if they chose 2
            System.out.print("Enter temperature in Celsius: ");  // ask for temp
            temperature = scanner.nextInt();  // save what they typed
            result = (temperature * 9.0 / 5.0) + 32;  // convert C to F
            System.out.println("Result: " + result + "F");  // show result
        } else {  // if they typed something else
            System.out.println("Invalid choice.");  // tell them that wasn't valid
        }

        scanner.close();  // clean up the scanner when done
    }
}