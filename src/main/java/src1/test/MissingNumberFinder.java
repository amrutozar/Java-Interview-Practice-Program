package src1.test;

public class MissingNumberFinder {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 3, 7, 8};
        int[] arr2 = {3, 1, 2, 5};

        int missingNumber1 = findMissingNumber(arr1);
        int missingNumber2 = findMissingNumber(arr2);

        System.out.println("Missing number in arr1: " + missingNumber1); // Output: Missing number in arr1: 5
        System.out.println("Missing number in arr2: " + missingNumber2); // Output: Missing number in arr2: 4
    }
}

