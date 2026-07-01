package month2;

import java.util.Scanner;  // lets us read what the user types
import java.io.PrintWriter;  // lets us write text into a file
import java.io.File;  // represents a file we want to read

public class FileIO {  // the class name must match the file name
    public static void main(String[] args) throws Exception {  // "throws Exception" lets file errors stop the program
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        System.out.print("Please input File Name: ");  // ask for the file name
        String fileName = scanner.nextLine();  // save what they typed

        System.out.print("Please input a Message: ");  // ask for the message to save
        String message = scanner.nextLine();  // save what they typed

        PrintWriter writer = new PrintWriter(fileName + ".txt");  // open the file for writing (saved next to the program)
        writer.println(message);  // write the message into the file
        writer.close();  // close the file so it actually saves

        System.out.println("Saved to desktop.");  // tell the user it saved

        File file = new File(fileName + ".txt");  // point to the same file we just made
        Scanner fileReader = new Scanner(file);  // tool to read the file's text
        String readBack = fileReader.nextLine();  // read the first line back out
        fileReader.close();  // close the file reader when done

        System.out.println("Read what you said: " + readBack);  // show what we read back
        scanner.close();  // clean up the scanner when done
    }
}