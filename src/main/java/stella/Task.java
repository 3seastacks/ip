package stella;

/**
 * Task contains a String description (which describe the task)
 * and a boolean isDone (with true indicating that the task is
 * completed and false indicating that the task is not completed)
 * Task is the parent of 3 classes: Deadline, Event and ToDo
 */
public abstract class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String curStatus() {
        if (isDone) {
            return "X";
        }
        else {
            return " ";
        }
    }

    public void markDone() {
        isDone = true;
    }

    public void markUndone() {
        isDone = false;
    }



    @Override
    public String toString() {
        return "[" + this.curStatus() + "] " + this.description;
    }

}
