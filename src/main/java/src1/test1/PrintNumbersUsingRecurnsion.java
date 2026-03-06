package src1.test1;

public class PrintNumbersUsingRecurnsion {
	// Recursive method to print numbers from 1 to n
    public static void printNumbers(int current, int n) {
        if (current > n) { // Base case: stop when current exceeds n
            return;
        }
        System.out.print(current + " "); // Print the current number
        printNumbers(current + 1, n);   // Recursive call with the next number
    }

    public static void main(String[] args) {
        int n = 10; // You can change this value to print up to a different number
        System.out.println("Printing numbers from 1 to " + n + " without loops:");
        printNumbers(1, n); // Start printing from 1
    }
}
