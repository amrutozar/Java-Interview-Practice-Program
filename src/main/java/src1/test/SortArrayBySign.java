package src1.test;

import java.util.ArrayList;
import java.util.List;

public class SortArrayBySign {

	public static void main(String[] args) {
        int[] arr = {-7, -35, 100, -5, 75, -25, -15, 95};
        int[] sortedArr = sortArrayBySign(arr);
        
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArrayBySign(int[] arr) {
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();

        // Separate negative and non-negative numbers
        for (int num : arr) {
            if (num < 0) {
                negativeNumbers.add(num);
            } else {
                positiveNumbers.add(num);
            }
        }

        // Combine the two lists
        int[] sortedArr = new int[arr.length];
        int index = 0;

        for (int num : negativeNumbers) {
            sortedArr[index++] = num;
        }

        for (int num : positiveNumbers) {
            sortedArr[index++] = num;
        }

        return sortedArr;
    }
}
