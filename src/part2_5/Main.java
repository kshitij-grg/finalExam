package part2_5;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = NotificationService.INSTANCE;
        notificationService.sendAlert("Emergency in Ward 7!");
    }
}
