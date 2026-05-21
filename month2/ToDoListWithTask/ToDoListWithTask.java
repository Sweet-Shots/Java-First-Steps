package month2.ToDoListWithTask;
/*
 * ⚠️ FULLY AI-GENERATED FILE ⚠️
 *
 * This entire file was generated using AI as part of my Java learning process.
 *
 * It is included for:
 * - Understanding how Java code is structured
 * - Learning how logic and syntax work in practice
 * - Comparing future improvements against generated examples
 *
 * This file may be replaced or rewritten later with my own implementation.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListWithTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            printScreen(tasks);
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            handleChoice(choice, tasks, scanner);
        }
    }

    public static void printScreen(ArrayList<Task> tasks) {
        System.out.println("--- To-Do List ---");
        System.out.println("Below are the tasks you\nneed to finish!");
        System.out.println("Pick your next option:");
        System.out.println("1. Add New To-Do");
        System.out.println("2. Toggle Completed");
        System.out.println("3. Exit");
        System.out.println("--- To-Do's ---");

        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getStatus() + " " + task.getDescription());
        }
    }

    public static void handleChoice(int choice, ArrayList<Task> tasks, Scanner scanner) {
        if (choice == 1) {
            System.out.println("Please type in your new To-Do!");
            System.out.print("Type here: ");
            String newToDo = scanner.nextLine();
            tasks.add(new Task(newToDo));
            System.out.println("Added!");
        } else if (choice == 2) {
            System.out.println("Please input the number of the task to toggle:");
            System.out.print("Choice: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();

            if (taskNumber < 1 || taskNumber > tasks.size()) {
                System.out.println("Invalid choice!");
            } else {
                Task task = tasks.get(taskNumber - 1);
                task.toggleCompleted();
                System.out.println("Item is now " + (task.isCompleted() ? "done" : "not done") + "!");
            }
        } else if (choice == 3) {
            System.out.println("Goodbye!");
            scanner.close();
            System.exit(0);
        } else {
            System.out.println("Error! Please input something else");
        }
    }
}

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void toggleCompleted() {
        completed = !completed;
    }

    public String getStatus() {
        return completed ? "[x]" : "[ ]";
    }
}
