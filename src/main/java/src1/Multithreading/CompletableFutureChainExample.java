package src1.Multithreading;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureChainExample {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            System.out.println("Starting computation...");
           // sleep(1000);
            if (false) throw new RuntimeException("Something went wrong!");
            return "Hello, World!";
        })
        .thenApply(result -> result + " from CompletableFuture.")
        .exceptionally(ex -> {
            System.out.println("Exception occurred: " + ex.getMessage());
            return "Default Result";  // Default result in case of error
        })
        .thenAccept(System.out::println); // Output the result or the default message
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
