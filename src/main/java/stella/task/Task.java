package stella.task;

import stella.Priority;
/**
 * Task contains a String description (which describe the task)
 * and a boolean isDone (with true indicating that the task is
 * completed and false indicating that the task is not completed)
 * Task is the parent of 3 classes: Deadline, Event and ToDo
 */
public abstract class Task {
    protected String description;
    protected boolean isDone;
    protected Priority taskPriority;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
        this.taskPriority = Priority.UNDECIDED;
    }

    public Task(String description, Priority taskPriority) {
        this.description = description;
        this.isDone = false;
        this.taskPriority = taskPriority;
    }

    /**
     * Indicate whether a task has been completed or not
     *
     * @return "X" represent that item is complete, while " " represent item is not completed
     */
    public String getCurrentStatus() {
        if (isDone) {
            return "X";
        } else {
            return " ";
        }
    }

    /**
     * Mark a task as completed
     */
    public void markDone() {
        isDone = true;
    }

    /**
     * Mark a task as uncompleted
     */
    public void markUndone() {
        isDone = false;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "[" + this.getCurrentStatus() + "] " + this.description;
    }

}
