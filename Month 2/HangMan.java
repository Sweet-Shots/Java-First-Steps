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

import java.util.Scanner;  // lets us read what the user types
import java.util.Random;  // lets us pick random numbers
import java.util.ArrayList;  // lets us use ArrayList (dynamic list that can grow)

public class HangMan {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        Random random = new Random();  // tool for random numbers

        String[] words = {"Today", "Mouse", "Computer", "Screen", "Jaylen", "Dog", "Cat", "Human", "House", "Test", "Car", "Tree", "Word", "Java", "Python", "Programming", "Money"};  // list of words to pick from
        String secretWord = pickWord(random, words);  // pick a random word
        secretWord = secretWord.toLowerCase();  // convert to lowercase so "Mouse" becomes "mouse"

        ArrayList<Character> guessedLetters = new ArrayList<Character>();  // stores all letters the user guesses
        int lives = 6;  // user starts with 6 lives
        boolean won = false;  // tracks if user won, starts as false

        System.out.println("--- Hangman Game ---");  // print title
        System.out.println("Guess the word! You have " + lives + " lives.");  // show lives

        while (lives > 0 && !won) {  // keep playing while user has lives and hasn't won
            displayWord(secretWord, guessedLetters);  // show word with _ for unguessed letters
            System.out.println("Lives left: " + lives);  // show remaining lives
            System.out.print("Guess a letter: ");  // ask for a letter
            String guessInput = scanner.nextLine();  // save what they typed

            char guess = guessInput.toLowerCase().charAt(0);  // get first letter, convert to lowercase

            if (guessedLetters.contains(guess)) {  // check if they already guessed this letter
                System.out.println("You already guessed '" + guess + "'!");  // tell them they tried it already
                continue;  // skip rest of loop, go to next iteration
            }

            guessedLetters.add(guess);  // add this letter to the list of guessed letters

            if (processGuess(secretWord, guess)) {  // check if letter is in the word
                System.out.println("Good guess!");  // they found a letter
            } else {
                System.out.println("Wrong guess!");  // letter is not in the word
                lives--;  // lose one life
            }

            won = true;  // assume they won, check if any letters are still hidden
            for (int i = 0; i < secretWord.length(); i++) {  // loop through each letter in the word
                char letterInWord = secretWord.charAt(i);  // get the letter at position i
                if (!guessedLetters.contains(letterInWord)) {  // if this letter hasn't been guessed
                    won = false;  // they haven't won yet
                    break;  // stop checking, we know they haven't won
                }
            }
        }

        if (won) {  // if they won
            System.out.println("You won! The word was: " + secretWord);  // tell them they won
        } else {  // if they lost
            System.out.println("You lost! The word was: " + secretWord);  // tell them the word
        }

        scanner.close();  // clean up the scanner when done
    }

    public static String pickWord(Random random, String[] words) {  // picks a random word from the list
        int randomIndex = random.nextInt(words.length);  // pick a random index (0 to length-1)
        return words[randomIndex];  // return the word at that index
    }

    public static void displayWord(String secretWord, ArrayList<Character> guessedLetters) {  // shows word with _ for hidden letters
        System.out.print("Word: ");  // print label

        for (int i = 0; i < secretWord.length(); i++) {  // loop through each letter in the word
            char letter = secretWord.charAt(i);  // get the letter at position i

            if (guessedLetters.contains(letter)) {  // if this letter was guessed
                System.out.print(letter + " ");  // show the actual letter
            } else {  // if not guessed yet
                System.out.print("_ ");  // show underscore instead
            }
        }
        System.out.println("");  // new line after displaying word
    }

    public static boolean processGuess(String secretWord, char guess) {  // checks if guessed letter is in the word
        if (secretWord.indexOf(guess) != -1) {  // indexOf returns -1 if not found
            return true;  // letter is in the word
        } else {
            return false;  // letter is not in the word
        }
    }
}
