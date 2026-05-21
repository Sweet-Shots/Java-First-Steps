package month2.ToDoListNew;

public class ToDoItem {
    String task;
    boolean completed;

    public ToDoItem(String task) {
        this.task = task;
        this.completed = false;
    }

    public void toggleComplete() {
        completed = !completed;
    }

    public String getDisplay() {
        if (completed) {return "[x] " + task;}
        else {return "[ ] " + task;}
    }
}
