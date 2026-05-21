package month2;

import java.util.Scanner;  // lets us read what the user types

public class CaesarCipher {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        String alphabet = "abcdefghijklmnopqrstuvwxyz";  // alphabet for looking up letter positions

        System.out.print("Please pick 1 for encrypting and 2 for decrypting: ");
        int method = scanner.nextInt();  // save what they typed (1 or 2)
        scanner.nextLine();  // consume leftover newline
        if (method == 1) {  // if they chose encrypting
            System.out.print("Please input your text for encrypting: ");
            String toEncrypt = scanner.nextLine();  // save text to encrypt
            System.out.print("Please input shift amount: ");
            int shiftValue = scanner.nextInt();  // save how much to shift
            String result = getCaesarCipherEncrypt(toEncrypt.toLowerCase(), shiftValue, alphabet);  // call encrypt method
            printResults(result, method);  // print the result

        } else {  // if they chose decrypting
            System.out.print("Please input your text for decrypting: ");
            String toEncrypt = scanner.nextLine();  // save text to decrypt
            System.out.print("Please input shift amount: ");
            int shiftValue = scanner.nextInt();  // save how much to shift
            String result = getCaesarCipherDecrypt(toEncrypt.toLowerCase(), shiftValue, alphabet);  // call decrypt method
            printResults(result, method);  // print the result
        }
        scanner.close();  // clean up the scanner when done
    }

    public static String getCaesarCipherEncrypt(String toEncrypt, int shiftValue, String alphabet) {  // encrypts text with shift
        String encrypted = "";  // empty string to build result
        for (int i = 0; i < toEncrypt.length(); i++) {  // loop through each letter
            char letter = toEncrypt.charAt(i);  // get the letter at position i
            int position = alphabet.indexOf(letter);  // find where this letter is in the alphabet
            if (position == -1) {  // if not in alphabet (space, punctuation)
                encrypted += letter;  // just add it unchanged
                continue;  // skip the shift math
            }
            int newPos = position + shiftValue;  // add the shift amount
            newPos %= 26;  // wrap around if past 25 (modulo)
            char newLetter = alphabet.charAt(newPos);  // get the new shifted letter
            encrypted += newLetter;  // add letter to result
        }
        return encrypted;  // send the encrypted text back
    }

    public static String getCaesarCipherDecrypt(String toEncrypt, int shiftValue, String alphabet) {  // decrypts text with shift
        String decrypt = "";  // empty string to build result
        for (int i = 0; i < toEncrypt.length(); i++) {  // loop through each letter
            char letter = toEncrypt.charAt(i);  // get the letter at position i
            int position = alphabet.indexOf(letter);  // find where this letter is in the alphabet
            if (position == -1) {  // if not in alphabet (space, punctuation)
                decrypt += letter;  // just add it unchanged
                continue;  // skip the shift math
            }
            int newPos = (position - shiftValue + 26) % 26;  // subtract shift, wrap backwards
            char newLetter = alphabet.charAt(newPos);  // get the new shifted letter
            decrypt += newLetter;  // add letter to result
        }
        return decrypt;  // send the decrypted text back
    }

    public static void printResults(String result, int method) {  // prints the final result
        if (method == 1) {  // if they encrypted
            String stringMethod = "Encrypted";
            System.out.println("Your text has been " + stringMethod);
        } else {  // if they decrypted
            String stringMethod = "Decrypted";
            System.out.println("Your text has been " + stringMethod);
        }
        System.out.println("Result: " + result);  // show the result
    }
}
