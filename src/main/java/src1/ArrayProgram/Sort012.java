package src1.ArrayProgram;

import java.util.Arrays;
/*
Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array. The functions should put all 0s first, then all 1s and all 2s in last.

Input: {0, 1, 2, 0, 1, 2}

Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}

Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2} */
public class Sort012 {

    public static void sortArray(int[] arr) {
        int low = 0;      // Pointer for 0s
        int mid = 0;      // Pointer for 1s
        int high = arr.length - 1; // Pointer for 2s

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment low and mid
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;

                case 1:
                    // No swap needed, just increment mid
                    mid++;
                    break;

                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 0, 1, 2};
        int[] arr2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sortArray(arr1);
        sortArray(arr2);

        System.out.println("Sorted Array 1: " + Arrays.toString(arr1));
        System.out.println("Sorted Array 2: " + Arrays.toString(arr2));
    }
}
