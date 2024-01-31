import java.util.List;

public class User {
    private String username;
    // private String profilePicture; // Uncomment this line if you have a profile picture field
    private List<String> pendingTasks;
    private List<String> completedTasks;

    public User(String username, List<String> pendingTasks, List<String> completedTasks) {
        this.username = username;
        // this.profilePicture = profilePicture; // Uncomment this line if you have a profile picture field
        this.pendingTasks = pendingTasks;
        this.completedTasks = completedTasks;
    }

    public String getUsername() {
        return username;
    }

    // Uncomment the following method if you have a profile picture field
    // public String getProfilePicture() {
    //     return profilePicture;
    // }

    public List<String> getPendingTasks() {
        return pendingTasks;
    }

    public List<String> getCompletedTasks() {
        return completedTasks;
    }
}
