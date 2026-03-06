package src1.ArrayProgram;

import java.util.ArrayList;
import java.util.List;
//Sort the given array based on positive and Negative by maintaining the order. int[] arr = {-7,-35,100,-5,75,-25,-15,95}; O/P [-7, -35, -5, -25, -15, 100, 75, 95]
public class SortBySign {

    public static int[] sortBySign(int[] arr) {
        // Create two lists to store negatives and positives
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();

        // Separate numbers into negatives and positives
        for (int num : arr) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
        }

        // Combine the two lists back into the array
        int index = 0;
        for (int num : negatives) {
            arr[index++] = num;
        }
        for (int num : positives) {
            arr[index++] = num;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-7, -35, 100, -5, 75, -25, -15, 95};
        arr = sortBySign(arr);

        System.out.println("Sorted array by sign, maintaining order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

