package month3;

import java.util.Scanner;  // lets us read what the user types
import java.io.PrintWriter;  // lets us write text into a file
import java.io.File;  // represents a file we want to read
import java.io.FileWriter;  // lets us add to a file instead of overwriting it

public class FileIONew {  // the class name must match the file name
    public static void main(String[] args) throws Exception {  // "throws Exception" lets file errors stop the program
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        System.out.println("Welcome to your journal! Below is your current entries.");  // greet the user

        System.out.println("-------------------");  // top divider line
        callJournal();  // show all the entries already saved
        System.out.println("-------------------");  // bottom divider line
        System.out.println("Please input a new entry below!\n");  // ask for a new entry
        System.out.print("> ");  // prompt symbol
        String meessageToAppend = scanner.nextLine();  // save what they typed
        PrintWriter writer = new PrintWriter(new FileWriter("journal.txt", true));  // open the file in append mode (true = don't wipe)
        writer.println(meessageToAppend + "\n");  // add the new entry to the file
        writer.close();  // close the file so it actually saves

        scanner.close();  // clean up the scanner when done
    }

    public static void callJournal() throws Exception{  // reads and prints every saved entry

        File file = new File("journal" + ".txt");  // point to the journal file
        if (!file.exists()) {  // if the file was never made yet
            System.out.println("No entries just yet!");  // tell the user it's empty
            return;  // nothing to read, so leave the method
        } else {  // the file exists, so read it
            Scanner fileReader = new Scanner(file);  // tool to read the file's text
            while (fileReader.hasNextLine()) {System.out.println(fileReader.nextLine());}  // print each line until there are none left
            fileReader.close();  // close the file reader when done
        }
    }
}