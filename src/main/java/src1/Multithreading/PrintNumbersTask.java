package src1.Multithreading;

public class PrintNumbersTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                // Simulate some delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }
}

