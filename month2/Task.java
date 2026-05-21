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

package month2;

public class Task {
    String description;  // the text of the task, like "Buy milk"
    boolean completed;   // true if the task is finished, false if not yet done

    public Task(String description) {
        // set the task text when a new Task object is created
        this.description = description;
        // new tasks start as not completed
        this.completed = false;
    }

    public void markComplete() {
        // set the task as finished
        this.completed = true;
    }

    public void toggleComplete() {
        // flip the finished state
        // if completed is false, it becomes true
        // if completed is true, it becomes false
        this.completed = !this.completed;
    }

    public String getState() {
        // return the visual checkbox for the task
        // [ ] means not completed, [x] means completed
        if (this.completed) {
            return "[x]";
        } else {
            return "[ ]";
        }
    }
}
