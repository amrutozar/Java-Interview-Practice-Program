package src1.test;

public class DistinctNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 8, 9, 10};
        printDistinctElements(array);
    }

    public static void printDistinctElements(int[] array) {
        boolean isDistinct;
        System.out.println("Distinct elements:");
        for (int i = 0; i < array.length; i++) {
            // Assume current element is distinct
            isDistinct = true;
            // Check if current element is distinct from previous elements
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDistinct = false;
                    break;
                }
            }
            // If current element is distinct, print it
            if (isDistinct) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
