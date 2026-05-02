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

package Month_2;

import java.util.ArrayList;  // lets us use ArrayList (dynamic list that can grow)
import java.util.Scanner;  // lets us read what the user types

public class NewConcepts {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        // ---------------------------------------------------------
        // NEW: char (single character)
        // ---------------------------------------------------------
        // char stores ONE character, uses single quotes like 'a'
        // String stores text, uses double quotes like "hello"
        char letter = 'a';  // a single character
        String word = "apple";  // a string of characters

        System.out.println("Char example: " + letter);  // prints: a
        System.out.println("String example: " + word);  // prints: apple

        // charAt(index) gets the character at a specific position
        char firstLetter = word.charAt(0);  // gets 'a' (first letter, index 0)
        System.out.println("First letter: " + firstLetter);  // prints: a

        // ---------------------------------------------------------
        // NEW: ArrayList with specific type
        // ---------------------------------------------------------
        // ArrayList is like an array but can grow and shrink
        // <Character> means this list only holds char values
        ArrayList<Character> letters = new ArrayList<Character>();  // empty list for characters

        letters.add('a');  // add 'a' to the list
        letters.add('b');  // add 'b' to the list
        letters.add('c');  // add 'c' to the list

        System.out.println("ArrayList size: " + letters.size());  // prints: 3
        System.out.println("First item: " + letters.get(0));  // prints: a

        // contains() checks if the list has a specific item
        if (letters.contains('b')) {  // check if 'b' is in the list
            System.out.println("List contains b!");  // prints if found
        }

        // ---------------------------------------------------------
        // NEW: boolean (true or false)
        // ---------------------------------------------------------
        // boolean stores only true or false
        boolean won = false;  // starts as false (not won yet)
        System.out.println("Won status: " + won);  // prints: false

        won = true;  // change to true
        System.out.println("Won status: " + won);  // prints: true

        // ---------------------------------------------------------
        // NEW: while loop with multiple conditions
        // ---------------------------------------------------------
        // && means BOTH conditions must be true
        // || means at least ONE condition must be true
        // ! means "NOT" (flips true to false, false to true)

        int lives = 3;  // start with 3 lives
        boolean gameOver = false;  // game is not over yet

        while (lives > 0 && !gameOver) {  // while lives > 0 AND game is NOT over
            System.out.println("Playing... lives left: " + lives);
            lives--;  // lose a life

            if (lives == 1) {  // if only 1 life left
                gameOver = true;  // end the game
            }
        }

        // ---------------------------------------------------------
        // NEW: break and continue
        // ---------------------------------------------------------
        for (int i = 0; i < 5; i++) {  // loop from 0 to 4

            if (i == 2) {  // if i equals 2
                continue;  // skip this iteration, go to next (3)
            }

            if (i == 4) {  // if i equals 4
                break;  // exit the loop entirely
            }

            System.out.println("i = " + i);  // prints: 0, 1, 3
        }

        // ---------------------------------------------------------
        // NEW: String methods
        // ---------------------------------------------------------
        String name = "Hello";

        name = name.toLowerCase();  // converts to lowercase: "hello"
        System.out.println("Lowercase: " + name);  // prints: hello

        // indexOf(char) returns the position of a letter, or -1 if not found
        int position = name.indexOf('e');  // 'e' is at position 1 in "hello"
        System.out.println("Position of e: " + position);  // prints: 1

        int notFound = name.indexOf('z');  // 'z' is not in "hello"
        System.out.println("Position of z: " + notFound);  // prints: -1

        scanner.close();  // clean up the scanner when done
    }
}
