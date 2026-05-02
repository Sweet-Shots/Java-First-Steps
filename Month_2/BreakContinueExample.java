package Month_2;

public class BreakContinueExample {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        for (int i = 1; i <= 10; i++) {  // loop from 1 to 10
            if (i == 3) {  // if i equals 3
                continue;  // skip to next iteration, don't print
            }
            if (i == 8) {  // if i equals 8
                break;  // exit the loop entirely
            }
            System.out.println(i);  // print the number (prints: 1, 2, 4, 5, 6, 7)
        }
    }
}
