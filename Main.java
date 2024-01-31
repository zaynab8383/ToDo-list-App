import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create default task lists
        TaskList todayList = new TaskList("Today");
        TaskList importantList = new TaskList("Important");
        TaskList allTasksList = new TaskList("All Tasks");


        TaskList universityList = new TaskList("University");

        // Add tasks to the task lists
        todayList.addTask(new Task("Complete Java assignment", true, "2022-10-15"));
        importantList.addTask(new Task("Prepare for presentation", true, "2022-10-20"));
        allTasksList.addTask(new Task("Buy groceries", false, "2022-10-18"));
        universityList.addTask(new Task("Study for exam", false, "2022-11-01"));
    }
}