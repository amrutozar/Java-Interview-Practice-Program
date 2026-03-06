package src1.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // First asynchronous task: fetch user's name
        CompletableFuture<String> fetchName = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching name...");
            sleep(1000);  // Simulate delay
            return "Alice";
        });

        // Second asynchronous task: fetch user's age
        CompletableFuture<Integer> fetchAge = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching age...");
            sleep(1500);  // Simulate delay
            return 30;
        });

        // Combine both tasks and process the result
        CompletableFuture<String> userInfo = fetchName.thenCombine(fetchAge, (name, age) -> {
            return "User Info: Name = " + name + ", Age = " + age;
        });

        // Print the final result
        try {
            System.out.println(userInfo.get()); // Blocking call to retrieve the result
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

