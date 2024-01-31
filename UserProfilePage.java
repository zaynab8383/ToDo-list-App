public class UserProfilePage {
    private User currentUser;

    public UserProfilePage(User currentUser) {
        this.currentUser = currentUser;
    }

    public void showUserInfo() {
        // Display user information
        System.out.println("User Information:");
        System.out.println("Username: " + currentUser.getUsername());
        //System.out.println("Profile Picture: " + currentUser.getProfilePicture());
        System.out.println("Number of Pending Tasks: " + currentUser.getPendingTasks().size());
        System.out.println("Number of Completed Tasks: " + currentUser.getCompletedTasks().size());
        System.out.println("Time Required for Pending Tasks: " + calculateTimeForPendingTasks());
    }
    private String calculateTimeForPendingTasks() {
        return "2 days"; // Example result
    }
}

