package src1.ArrayProgram;

import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {10, 45, 30, 15, 75, 20};

        // Find maximum element
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Max Element: " + max);

        // Find minimum element
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Min Element: " + min);
    }
}

