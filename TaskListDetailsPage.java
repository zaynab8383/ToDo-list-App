import java.util.Collections;
import java.util.List;

public class TaskListDetailsPage {
    private TaskList selectedList;

    public TaskListDetailsPage(TaskList selectedList) {
        this.selectedList = selectedList;
    }

    public void showDetails() {
        // Display the details of the selected list, including its tasks
        List<Task> tasks = selectedList.getTasks();
        Collections.sort(tasks, (t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));

        for (Task task : tasks) {
            System.out.println("Task: " + task.getDescription());
            System.out.println("Due Date: " + task.getDueDate());
            System.out.println("Important: " + (task.isImportant() ? "Yes" : "No"));
            System.out.println("Done: " + (task.isDone() ? "Yes" : "No"));
            System.out.println("---------------------");
        }
    }

    public void addTask(Task task) {
        selectedList.addTask(task);
    }

    public void deleteTask(Task task) {
        selectedList.getTasks().remove(task);
    }

    public void changeListName(String newName) {
        selectedList.setName(newName);
    }

}
