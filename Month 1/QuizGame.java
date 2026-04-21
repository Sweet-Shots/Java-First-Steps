import java.util.Scanner;  // lets us read what the user types

public class QuizGame {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        int score = 0;  // keeps track of how many they get right

        // ---------------------------------------------------------
        // ARRAYS - What are they?
        // ---------------------------------------------------------
        // Think of an array like a list or a row of boxes
        // Instead of making 5 separate variables, we can make ONE array
        //
        // Example without array (boring way):
        //   String question1 = "What color is the sky?";
        //   String question2 = "What animal says meow?";
        //   String question3 = "How many days in a week?";
        //   ... this gets tiring!
        //
        // Example with array (awesome way):
        //   String[] questions = {"question1", "question2", "question3"};
        //   Now we can access them as questions[0], questions[1], questions[2]
        //
        // IMPORTANT: Arrays start counting from 0, not 1!
        //   questions[0] = first item
        //   questions[1] = second item
        //   questions[2] = third item
        // ---------------------------------------------------------

        // This is a String array - it stores text
        // We put {} to list all the items inside
        String[] questions = {  // list of all questions - each one separated by comma
            "What color is the sky?",   // questions[0] - first question
            "What animal says 'meow'?", // questions[1] - second question
            "How many days are in a week?", // questions[2] - third question
            "What is 2 + 2?",           // questions[3] - fourth question
            "Which planet is closest to the sun?" // questions[4] - fifth question
        };

        // This is a 2D array - think of it like a table
        // First number = which row (question), second number = which column (option)
        // options[0][0] = "Blue" (question 1, option 1)
        // options[0][1] = "Green" (question 1, option 2)
        // options[1][0] = "Dog" (question 2, option 1)
        // ...and so on
        String[][] options = {  // 2D array - each row is a question's options
            {"Blue", "Green", "Red", "Purple"},    // options for question 0
            {"Dog", "Cat", "Cow", "Duck"},         // options for question 1
            {"Five", "Six", "Seven", "Eight"},     // options for question 2
            {"Three", "Four", "Five", "Six"},      // options for question 3
            {"Venus", "Mars", "Mercury", "Jupiter"} // options for question 4
        };

        // This is an int array - it stores numbers
        // answers[0] = 1 means the first question's answer is option 1
        // answers[1] = 2 means the second question's answer is option 2
        int[] answers = {1, 2, 3, 2, 3};  // the correct answer for each question (1-4)

        System.out.println("--- Easy Quiz Game ---");  // print title
        System.out.println("Answer each question with 1, 2, 3, or 4");  // instructions

        // ---------------------------------------------------------
        // FOR LOOPS - What are they?
        // ---------------------------------------------------------
        // A loop repeats code instead of writing it over and over
        //
        // Basic for loop structure:
        //   for (start; keep going while; what to do each time)
        //
        // Example:
        //   for (int i = 0; i < 5; i++)
        //
        //   1. int i = 0    -> start i at 0 (first item in array)
        //   2. i < 5        -> keep going while i is less than 5
        //   3. i++          -> add 1 to i each time (i = i + 1)
        //
        // It runs 5 times: i=0, i=1, i=2, i=3, i=4
        // When i=5, it stops because 5 is not < 5
        //
        // questions.length = 5 (there are 5 items in the array)
        // So this loop runs for each question automatically!
        // ---------------------------------------------------------

        // for loop - repeats code for each item in the array
        // i starts at 0, and goes up to 4 (the last index)
        // i++ means add 1 to i each time
        for (int i = 0; i < questions.length; i++) {  
            // questions[i] means "get the question at position i"
            // when i=0, we get questions[0] = "What color is the sky?"
            // when i=1, we get questions[1] = "What animal says 'meow'?"
            System.out.println("\n" + questions[i]);  // print the question

            // This is a NESTED loop (a loop inside a loop)
            // This inner loop runs for EACH question
            // j goes from 0 to 3 (printing options 1, 2, 3, 4)
            for (int j = 0; j < 4; j++) {
                // options[i][j] gets the option at row i, column j
                // (j + 1) because we want to show 1,2,3,4 but arrays start at 0
                System.out.println((j + 1) + ". " + options[i][j]);
            }

            System.out.print("Your answer: ");  // ask for answer
            int answer = scanner.nextInt();  // save what they typed

            // answers[i] gets the correct answer for question at position i
            // if user answer equals the correct answer, they get a point
            if (answer == answers[i]) {  // check if their answer matches correct one
                System.out.println("Correct!");  // tell them they got it right
                score = score + 1;  // add to their score
            } else {  // if they got it wrong
                // Show them the correct answer
                // options[i][answers[i] - 1] gets the text of the correct option
                System.out.println("Wrong, the answer was " + answers[i] + ". " + options[i][answers[i] - 1]);
            }
        }

        // questions.length automatically gets the number of items (5)
        System.out.println("\n--- Your Score ---");  // show final score
        System.out.println("You got " + score + " out of " + questions.length + " correct!");  // print the score

        scanner.close();  // clean up the scanner when done
    }
}