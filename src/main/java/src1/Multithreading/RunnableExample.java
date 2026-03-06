package src1.Multithreading;

public class RunnableExample {
    public static void main(String[] args) {
        // Create a Runnable task
        Runnable task = new PrintNumbersTask();
        Runnable task1 = ()->System.out.println("in thread");;
        // Create a Thread to run the task
        Thread thread = new Thread(task);
        Thread thread1 = new Thread(task1);
        // Start the thread
        thread.start();
        thread1.start();
    }
}

