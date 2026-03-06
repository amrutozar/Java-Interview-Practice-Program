package src1.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringKeyValueGrouping {

	public static void main(String[] args) {
        String ayz = "a-1,b-2,c-3,a-5,b-7,c-8,d-9";

        // Split by comma to get individual key-value pairs
        Map<String, List<Integer>> result = Arrays.stream(ayz.split(","))
                .map(pair -> pair.split("-"))  // Split each pair by hyphen
                .collect(Collectors.groupingBy(
                        arr -> arr[0],  // Use the key (arr[0]) as the map key
                        Collectors.mapping(arr -> Integer.parseInt(arr[1]), Collectors.toList()) // Collect values as integers
                ));

        // Print the result
        result.forEach((key, valueList) -> System.out.println("{" + key + ", " + valueList + "}"));
    }
}
