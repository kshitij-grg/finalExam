package part2_5;

public enum NotificationService {
    INSTANCE;

    public void sendAlert(String message){
        System.out.println(message);
    }
}
