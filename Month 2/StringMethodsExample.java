import java.util.Scanner;

public class StringMethodsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Word: ");
        String word = scanner.nextLine().toLowerCase();
        System.out.print("Input a Character: ");
        char character = scanner.next().toLowerCase().charAt(0);

        int result = word.indexOf(character);

        if (result < 0) {
            System.out.println("The word: '" + word + "' does NOT contain the character: '" + character + "'");
        }
        else {
            System.out.println("The word: '" + word + "' does contain the character: '" + character + "'");
        }


        scanner.close();
    }
}
