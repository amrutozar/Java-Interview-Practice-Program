package src1.test;

public class MoveZeroesToEnd {

    public static void moveZeroesToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Fill the rest of the array with zeroes
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 8};

        System.out.println("Original array:");
        printArray(arr);

        moveZeroesToEnd(arr);

        System.out.println("Array after moving zeroes to the end:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

