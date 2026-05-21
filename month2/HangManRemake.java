package month2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class HangManRemake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] words = {"Apple", "House", "Water", "Music", "Light", "Earth", "Night", "World", "Happy", "Green", "Table", "Chair", "Phone", "Book", "Pencil", "Ocean", "River", "Mountain", "Forest", "Garden", "School", "Friend", "Family", "Dream", "Heart", "Money", "Time", "Space", "Voice", "Dance", "Pizza", "Bread", "Cheese", "Plant", "Flower", "Cloud", "Storm", "Thunder", "Silver", "Golden", "Purple", "Orange", "Diamond", "Castle", "Knight", "Dragon", "Wizard", "Magic", "Sword", "Shield", "Armor", "Battle"};
        String secretWord = pickWord(random, words);
        secretWord = secretWord.toLowerCase();

        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        int lives = 6;
        boolean won = false;

        System.out.println("Handman Remake");
        System.out.println("Guess the word, you have " + lives + " lives.");

        while (lives > 0 && !won) {
            displayWord(secretWord, guessedLetters);
            System.out.println("Lives left: " + lives);
            System.out.println("Guess a letter: ");
            String guessInput = scanner.nextLine();
            char guess = guessInput.toLowerCase().charAt(0);
            if (guessedLetters.contains(guess)) {
                System.out.println("You've already guessed that!");
                continue;
            }

            guessedLetters.add(guess);

            if (processGuess(secretWord, guess)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong guess!");
                lives--;
            }

            won = true;
            for (int i = 0; i < secretWord.length(); i++) {
                char letterInWord = secretWord.charAt(i);
                if (!guessedLetters.contains(letterInWord)) {
                    won = false;
                    break;
                }
            }

        }

        if (won) {
            System.out.println("You won! The word was: " + secretWord);
        } else {
            System.out.println("You lost, the word was: " + secretWord);
        }

        scanner.close();
    }

    public static String pickWord(Random random, String[] words) {
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }

    public static void displayWord(String secretWord, ArrayList<Character> guesstedLetters) {
        System.out.println("Word: ");
        for (int i = 0; i < secretWord.length(); i++) {
            char letter = secretWord.charAt(i);

            if (guesstedLetters.contains(letter)) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println("");
    }

    public static boolean processGuess(String secretWord, char guess) {
        if (secretWord.indexOf(guess) != -1) {
            return true;
        } else {
            return false;
        }
    }
}
