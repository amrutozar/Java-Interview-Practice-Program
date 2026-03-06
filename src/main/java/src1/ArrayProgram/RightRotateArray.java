package src1.ArrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int rotations = 2;

        // Perform right rotation
        int[] rotated = IntStream.concat(
                Arrays.stream(numbers).skip(numbers.length - rotations),
                Arrays.stream(numbers).limit(numbers.length - rotations)
        ).toArray();

        System.out.println("Right Rotated Array: " + Arrays.toString(rotated));
    }
}
//output
//Right Rotated Array: [4, 5, 1, 2, 3]
