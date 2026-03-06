package src1.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create a Callable task
        FactorialCalculator task = new FactorialCalculator(5);

        // Submit the task to the executor service
        Future<Integer> futureResult = executorService.submit(task);

        try {
            // Retrieve the result of the Callable task
            Integer result = futureResult.get();
            System.out.println("Factorial result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor service
            executorService.shutdown();
        }
    }
}

