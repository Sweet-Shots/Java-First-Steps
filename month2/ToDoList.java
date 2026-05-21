package month2;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoListItems = new ArrayList<>();
        ArrayList<Boolean> completedList = new ArrayList<>();

        while (true) {
            printScreen(toDoListItems, completedList);
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            handleChoice(choice, toDoListItems, scanner, completedList);
        }
    }

    public static void printScreen(ArrayList<String> toDoListItems, ArrayList<Boolean> completedList) {
        System.out.println("--- To-Do List ---");
        System.out.println("Below are the tasks you\nneed to finish!");
        System.out.println("Pick your next option:");
        System.out.println("1. Add New To-Do");
        System.out.println("2. Complete a Item");
        System.out.println("3. Exit (Data wont save!)");
        System.out.println("--- To-Do's ---");
        for (int i = 0; i < toDoListItems.size(); i++) {
            System.out.println((i+1) + ". " + getState(i, completedList) + " " + toDoListItems.get(i));
        }
    }

    public static void handleChoice(int choice, ArrayList<String> toDoListItems, Scanner scanner, ArrayList<Boolean> completedList) {
        if (choice == 1) {
            System.out.println("Please type in your new To-Do!");
            System.out.print("Type here: ");
            String newToDo = scanner.nextLine();
            toDoListItems.add(newToDo);
            completedList.add(false);
            System.out.println("Added!");
        } else if (choice == 2) {
            System.out.println("Please input the number of the To-Do that is finished!");
            System.out.print("Choice: ");
            int completedToDo = scanner.nextInt();
            scanner.nextLine();
            if (completedToDo < 1 || completedToDo > toDoListItems.size()) {
                System.out.println("Invalid choice!");
            } else {
                setCompleted(completedToDo, completedList);
                System.out.println("Item is now done!");
            }
        } else if (choice == 3) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Error! Please input something else");
        }
    }
    public static void setCompleted(int completedToDo, ArrayList<Boolean> completedList) {
        completedList.set((completedToDo-1), !completedList.get((completedToDo-1)));
    }
    public static String getState(int index, ArrayList<Boolean> completedList) {
        if (completedList.get(index) == false) {return "[ ]";}
        else {return "[x]";}
    }
}