package part2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> staffList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            staffList.add("Kshitij - " + i);
        }

        int numThreads = 10;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        for (String staff : staffList) {
            executor.execute(() -> sendAlert(staff));
            Thread.sleep(2000);
        }
        executor.shutdown();
    }

    public static void sendAlert(String staff) {
        System.out.println("Staff " + staff + ". Please come to the emergency area!!!");
    }
}
