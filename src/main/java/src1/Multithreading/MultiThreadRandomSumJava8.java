package src1.Multithreading;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MultiThreadRandomSumJava8 {
    private static final Random random = new Random();

    // Method to generate a random number
    public static int getRandomNumber() {
        return random.nextInt(100); // Generates a random number between 0 and 99
    }

    public static void main(String[] args) {
        // Create three asynchronous tasks to generate random numbers
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(MultiThreadRandomSumJava8::getRandomNumber);
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(MultiThreadRandomSumJava8::getRandomNumber);
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(MultiThreadRandomSumJava8::getRandomNumber);

        // Sum the results of the three futures
        CompletableFuture<Integer> sumFuture = future1
                .thenCombine(future2, Integer::sum)
                .thenCombine(future3, Integer::sum);

        try {
            // Retrieve and print the result
            int sum = sumFuture.get();
            System.out.println("Sum of random numbers: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

