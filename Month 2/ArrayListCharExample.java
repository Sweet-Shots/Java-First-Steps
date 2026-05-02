import java.util.ArrayList;  // lets us use ArrayList (dynamic list that can grow)
import java.util.Scanner;  // lets us read what the user types

public class ArrayListCharExample {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input
        ArrayList<Character> charList = new ArrayList<Character>();  // stores characters the user enters

        for (int i = 0; i < 3; i++) {  // loop 3 times to get 3 letters
            System.out.print("Input Letter: ");  // ask for a letter
            char character = scanner.next().charAt(0);  // read first character of their input

            if (charList.contains(character)) {  // check if letter is already in the list
                System.out.println("You already put that in!");  // tell them it's a duplicate
                i = i - 1;  // stay on this iteration (cancel the i++ so we ask again)
                continue;  // skip adding, go to next iteration
            }

            charList.add(character);  // add the new letter to the list
        }

        System.out.println(charList);  // print the full list of letters

        scanner.close();  // clean up the scanner when done
    }
}
