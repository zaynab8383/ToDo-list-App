public class TaskDetailsPage {
    private Task selectedTask;

    public TaskDetailsPage(Task selectedTask) {
        this.selectedTask = selectedTask;
    }

    public void showDetails() {
        // Display the details of the selected task
        System.out.println("Task: " + selectedTask.getDescription());
        System.out.println("Due Date: " + selectedTask.getDueDate());
        System.out.println("Important: " + (selectedTask.isImportant() ? "Yes" : "No"));
        System.out.println("Done: " + (selectedTask.isDone() ? "Yes" : "No"));
        System.out.println("Starred: " + (selectedTask.isStarred() ? "Yes" : "No"));
        System.out.println("Deadline: " + selectedTask.getDeadline());
        //System.out.println("Reminder: " + (selectedTask.isReminderEnabled() ? "Enabled" : "Disabled"));
        //System.out.println("Notes: " + selectedTask.getNotes());
    }

    public void toggleDoneStatus() {
        selectedTask.isDone();
    }

    public void toggleStarredStatus() {
        selectedTask.isStarred();
    }

    public void changeDeadline(String newDeadline) {
        selectedTask.setDeadline(newDeadline);
    }

}
