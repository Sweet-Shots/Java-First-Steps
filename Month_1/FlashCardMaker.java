package Month_1;

import java.util.ArrayList;  // lets us use ArrayList (dynamic list that can grow)
import java.util.Scanner;  // lets us read what the user types

public class FlashCardMaker {  // the class name must match the file name
    public static void main(String[] args) {  // this is where the program starts
        Scanner scanner = new Scanner(System.in);  // tool to read user input

        // Two ArrayLists to store questions and answers separately
        ArrayList<String> flashCardsQuestions = new ArrayList<String>();  // stores the questions
        ArrayList<String> flashCardsAnswers = new ArrayList<String>();  // stores the answers

        System.out.println("--- Flash Card Maker ---");  // print title
        boolean addingQuestions = true;  // keeps looping while user wants to add

        // Loop: keep asking for questions until user types "done"
        while (addingQuestions == true) {  // while they still want to add questions
            System.out.println("");  // blank line for spacing
            System.out.println("Please put the phrase 'done' if you are finished.");  // instruction
            System.out.print("Please input your question: ");  // ask for a question
            String question = scanner.nextLine();  // save what they typed

            if (question.equals("done")) {  // if they typed "done"
                addingQuestions = false;  // stop the loop
            } else {  // if they typed something else
                flashCardsQuestions.add(question);  // add question to the list
                System.out.print("Please input the answer to this question: ");  // ask for the answer
                String answer = scanner.nextLine();  // save what they typed
                flashCardsAnswers.add(answer);  // add answer to the list
            }
        }
        System.out.println("\n".repeat(50));  // clear the screen

        int question = 0;  // start at the first question (index 0)
        int total = flashCardsQuestions.size();  // how many questions they made
        int correct = 0;  // how many they got right

        // Loop: go through each flashcard and quiz the user
        while (question < flashCardsQuestions.size()) {  // while there are more questions
            System.out.println("--- Question " + (question + 1) + " ---");  // show question number (1, 2, 3...)
            System.out.println(flashCardsQuestions.get(question));  // print the question
            System.out.print("Answer: ");  // ask for their answer
            String userAnswer = scanner.nextLine();  // save what they typed

            if (userAnswer.equals(flashCardsAnswers.get(question))) {  // if their answer matches
                System.out.println("Correct!");  // tell them they got it right
                correct++;  // add 1 to their score
            } else {  // if their answer is wrong
                System.out.println("Oops! That wasn't correct...");  // tell them they got it wrong
                System.out.println("Answer: " + flashCardsAnswers.get(question));  // show the correct answer
            }

            question++;  // move to the next question
            System.out.println("");  // blank line for spacing
        }

        System.out.println("You're done!\n");  // tell them the quiz is over
        System.out.println("--- Results ---");  // show final results
        System.out.println("Correct: " + correct);  // print how many they got right
        System.out.println("Total: " + total);  // print how many questions there were
        System.out.println("Grade: " + correct + "/" + total);  // print their grade
            
        scanner.close();  // clean up the scanner when done
    }
}