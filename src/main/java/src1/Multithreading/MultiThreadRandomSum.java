package src1.Multithreading;

import java.util.concurrent.*;
import java.util.Random;

public class MultiThreadRandomSum {
    private static final Random random = new Random();

    // Method to generate a random number
    public static int getRandomNumber() {
        return random.nextInt(100); // Generates a random number between 0 and 99
    }

    public static void main(String[] args) {
        // Executor service to manage threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Callable tasks to generate random numbers
        Callable<Integer> task = MultiThreadRandomSum::getRandomNumber;

        // Future objects to store results from each thread
        Future<Integer> future1 = executor.submit(task);
        Future<Integer> future2 = executor.submit(task);
        Future<Integer> future3 = executor.submit(task);

        try {
            // Retrieve results from each future and calculate the sum
            int sum = future1.get() + future2.get() + future3.get();
            System.out.println("Sum of random numbers: " + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Shutdown the executor
        }
    }
}

