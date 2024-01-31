import java.util.ArrayList;
import java.util.List;

public class Task {
    private String description;
    private boolean isImportant;
    private String dueDate;
    private String deadline;

    public Task(String description, boolean isImportant, String dueDate) {
        this.description = description;
        this.isImportant = isImportant;
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    public void setIsImportant(boolean isImportant) {
        this.isImportant = isImportant;
    }

    public boolean getIsImportant() {
        return isImportant;
    }

    public boolean isImportant() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    public boolean isStarred() {
        return false;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }


}


