package month2.ToDoListNew;

public class ToDoItem {  // a single to-do item
    String task;  // what needs to be done
    boolean completed;  // whether it's done (true/false)

    public ToDoItem(String task) {  // runs when you create a new ToDoItem
        this.task = task;  // save the task description
        this.completed = false;  // starts as not completed
    }

    public void toggleComplete() {  // flips completed between true/false
        completed = !completed;  // ! means NOT — flips boolean
    }

    public String getDisplay() {  // returns how the item looks (with checkbox)
        if (completed) {return "[x] " + task;}  // show checked if done
        else {return "[ ] " + task;}  // show unchecked if not done
    }
}
