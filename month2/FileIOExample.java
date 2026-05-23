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

package month2;

import java.util.Scanner;  // lets us read what the user types
import java.io.PrintWriter;  // lets us write text to files
import java.io.File;  // lets us work with files on the computer

public class FileIOExample {  // the class name must match the file name
    public static void main(String[] args) throws Exception {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        System.out.print("Enter a message: ");
        String message = scanner.nextLine();  // save what they typed

        // Write the message to a file on the desktop
        PrintWriter writer = new PrintWriter("C:\\Users\\ducki\\Desktop\\myfile.txt");  // opens a file for writing
        writer.println(message);  // write the message to the file
        writer.close();  // save and close the file

        System.out.println("Saved to desktop!");

        // Read the message back from the file
        File file = new File("C:\\Users\\ducki\\Desktop\\myfile.txt");  // point to the file
        Scanner fileReader = new Scanner(file);  // tool to read from the file (not the keyboard)
        String readBack = fileReader.nextLine();  // read the first line from the file
        fileReader.close();  // close the file reader

        System.out.println("Read back from file: " + readBack);  // print what was in the file

        scanner.close();  // clean up the scanner when done
    }
}
