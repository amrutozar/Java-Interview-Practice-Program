package src1.ArrayProgram;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 0, 6, 0, 3, 0, 5, 1};

        // Create a stream of the array, filter and collect non-zero and zero elements separately
        List<Integer> result = IntStream.of(arr)
                .filter(num -> num != 0) // Get non-zero numbers
                .boxed()
                .collect(Collectors.toList());

        // Add the zeros at the end
        long zeroCount = IntStream.of(arr).filter(num -> num == 0).count();
        for (int i = 0; i < zeroCount; i++) {
            result.add(0); // Append zeroes
        }

        // Convert List back to an array
        int[] outputArray = result.stream().mapToInt(Integer::intValue).toArray();

        // Print the result
        System.out.println(Arrays.toString(outputArray));
        
        int[] arr1 = {1, 2, 0, 4, 0, 6, 0, 3, 0, 5, 1};
        int[] newArr=new int[arr1.length];
        int j=0;
        for(int i=0;i<arr1.length;i++)
        {
        	if(arr1[i]!=0)
        	{
        		newArr[j]=arr1[i];
        		j++;
        	}
        }
        arr1= Arrays.copyOf(newArr, newArr.length);
        System.out.println("new array="+Arrays.toString(arr1));
        System.out.println("new array="+Arrays.toString(newArr));
    }
}
