package src1.ArrayProgram;

import java.util.Arrays;

public class CheckEqualArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        // Check if arrays are equal
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Are Arrays Equal: " + areEqual);
    }
}

