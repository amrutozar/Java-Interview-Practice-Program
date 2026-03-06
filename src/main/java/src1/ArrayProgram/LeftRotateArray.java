package src1.ArrayProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int rotations = 2;

        // Perform left rotation
        int[] rotated = IntStream.concat(
                Arrays.stream(numbers).skip(rotations),
                Arrays.stream(numbers).limit(rotations)
        ).toArray();

        System.out.println("Left Rotated Array: " + Arrays.toString(rotated));
    }
}
//output
//Left Rotated Array: [3, 4, 5, 1, 2]

