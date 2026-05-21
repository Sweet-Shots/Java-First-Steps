package month2.ToDoListNew;

import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList {
    Scanner scanner = new Scanner(System.in);
    ArrayList<ToDoItem> items = new ArrayList<>();

    public static void main(String[] args) {
        ToDoList app = new ToDoList();

        while (true) {
            app.displayScreen();
            app.handleChoice();
        }
    }
    
    public void displayScreen() {
        System.out.println("--- ToDoList Choices---");
        System.out.println("1. New Item");
        System.out.println("2. Toggle Compleation");
        System.out.println("3. Exit");
        System.out.println("--- To-Do ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getDisplay());
        }
    }

    public void handleChoice() {
        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {addItem();}
        else if (choice == 2) {choiceForToggle();}
        else if (choice == 3) {System.exit(0);}
        else {System.out.println("Invalid Choice");}
    }

    public void choiceForToggle() {
        System.out.print("Input Item ID (e.g: 1): ");
        int choice = scanner.nextInt();
        int index = choice - 1;
        if (index >= 0 && index < items.size()) {
            items.get(index).toggleComplete();
            System.out.println("Toggled!");
        } else {
            System.out.println("Invalid item.");
        }
    }

    public void addItem() {
        System.out.print("Task: ");
        String task = scanner.nextLine();

        items.add(new ToDoItem(task));
        //System.out.println(items.get(0).getDisplay());
    }
}