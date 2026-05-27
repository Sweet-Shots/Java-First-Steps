package month2.ToDoListNew;

import java.util.Scanner;  // lets us read what the user types
import java.util.ArrayList;  // lets us use ArrayList (dynamic list that can grow)

public class ToDoList {  // the main app that manages all to-do items
    Scanner scanner = new Scanner(System.in);  // tool to read user input (shared across all methods)
    ArrayList<ToDoItem> items = new ArrayList<>();  // stores all to-do items
    String RESET = "\u001B[0m";  // resets color back to normal
    String RED = "\u001B[31m";  // makes text red
    String GREEN = "\u001B[32m";  // makes text green
    String CLEAR = "\033[H\033[2J";  // clears the console
    String YELLOW = "\u001B[33m";  // makes text yellow
    String REDBG = "\u001B[41m";  // makes background red

    public static void main(String[] args) {  // this is where the program starts
        ToDoList app = new ToDoList();  // create the app so we can use its methods

        while (true) {  // loop forever (exit handles stopping)
            app.displayScreen();  // show the menu and list
            app.handleChoice();  // wait for user's choice
        }
    }
    
    public void displayScreen() {  // prints the menu and all to-do items
        System.out.println(CLEAR);  // clear screen before redrawing
        System.out.println(GREEN + "--- ToDoList Choices---" + RESET);
        System.out.println(YELLOW + "1. " + RESET + "New To-Do");
        System.out.println(YELLOW + "2. " + RESET + "Toggle Compleation");
        System.out.println(YELLOW + "3. " + RESET + "Delete To-Do");
        System.out.println(YELLOW + "4. " + RESET + "Exit\n");
        System.out.println(GREEN + "--- To-Do ---" + RESET);
        if (items.size() <= 0) {System.out.println("No To-Do's to do! Maybe get started by adding one!");}
        for (int i = 0; i < items.size(); i++) {  // loop through all items
            System.out.println((i + 1) + ". " + items.get(i).getDisplay());  // print number and item
        }
    }

    public void handleChoice() {  // asks user what they want to do and runs that option
        System.out.print("Choice (e.g: 1): ");
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {addItem();}  // add new item
            else if (choice == 2) {choiceForToggle();}  // toggle completion
            else if (choice == 3) {choiceDelete();}  // delete item
            else if (choice == 4) {System.exit(0);}  // exit program
            else {System.out.println("\nInvalid Choice");}
        } catch (Exception e) {
            errorMessage("Not a number.");
            scanner.nextLine();
        }
    }

    public void choiceForToggle() {  // marks an item as done/undone
        System.out.print("Input To-Do ID (e.g: 1): ");
        try {
            int choice = scanner.nextInt();  // save which item
            scanner.nextLine();
            int index = choice - 1;  // convert to 0-based index
            if (index >= 0 && index < items.size()) {  // make sure it exists
                items.get(index).toggleComplete();  // flip completed status
                System.out.println("\nToggled!");
            } else {errorMessage("Invalid Number");}
        } catch (Exception e) {errorMessage("Not a number.");}
    }

    public void addItem() {  // adds a new task to the list
        System.out.print("To-Do: ");
        String task = scanner.nextLine();  // save what they typed

        items.add(new ToDoItem(task));  // create new item and add to list
    }

    public void choiceDelete() {  // removes an item from the list
        System.out.print("Input To-Do ID (e.g: 1): ");
        try {
            int choice = scanner.nextInt();  // save which item
            scanner.nextLine();
            int index = choice - 1;  // convert to 0-based index
            if (index >= 0 && index < items.size()) {  // make sure it exists
                items.remove(index);  // remove it from the list
                System.out.println("To-Do " + choice + " has been deleted.");
            } else {errorMessage("Invalid Number.");}
        } catch (Exception e) {errorMessage("Not a number.");}
    }

    public void errorMessage(String reason) {  // shows an error with red background, waits 2 seconds
        System.out.println(REDBG + "\nError." + RESET + " Reason: " + reason);
        try {Thread.sleep(2000);}  // wait 2 seconds so user can read error
        catch (Exception e) {}  // do nothing if sleep fails
    }
}