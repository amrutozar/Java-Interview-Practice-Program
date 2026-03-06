package src1.test;

public class PairSum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15, -2, 4, 5, 3, 6};
        int targetSum = 9;
        
        findPairsWithSum(array, targetSum);
    }

    public static void findPairsWithSum(int[] array, int targetSum) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Index pair: (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pairs found with the sum of " + targetSum);
        }
    }
}

