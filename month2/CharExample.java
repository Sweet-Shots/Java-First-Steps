package month2;

import java.util.Scanner;  // lets us read what the user types

public class CharExample {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        System.out.print("Please input a word: ");  // ask for a word
        String word = scanner.nextLine();  // save what they typed
        
        for (int i = 0; i < word.length(); i++) {  // loop through each letter in the word
            System.out.println(word.charAt(i));  // print the letter at position i
        }

        scanner.close();  // clean up the scanner when done
    }
}
