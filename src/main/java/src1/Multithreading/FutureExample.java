package src1.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Callable task that calculates the sum of numbers up to 10
        Callable<Integer> sumTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
                Thread.sleep(100);  // Simulating delay
            }
            return sum;
        };

        // Submit the task and get a Future object
        Future<Integer> future = executorService.submit(sumTask);

        try {
            // Check if the task is done
            if (!future.isDone()) {
                System.out.println("Task is still running...");
            }

            // Retrieve the result once it's done
            Integer result = future.get(); // This will block until result is ready
            System.out.println("Sum of numbers up to 10: " + result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor service
            executorService.shutdown();
        }
    }
}

