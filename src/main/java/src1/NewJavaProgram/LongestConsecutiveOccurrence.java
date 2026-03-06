package src1.NewJavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 2, 5, 6, 7, 4, 5, 6, 7, 8, 9};
        List<Integer> longestConsecutive = findLongestConsecutive(input);
        System.out.println("Longest consecutive occurrence: " + longestConsecutive);
        
        List<Integer> longestConsecutive1 = findLongestConsecutive1(input);
        System.out.println("Longest consecutive occurrence: " + longestConsecutive1);
	}
	 public static List<Integer> findLongestConsecutive(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return List.of();
	        }
	       
	        return   Arrays.stream(nums)
	                .boxed()
	                .collect(Collectors.groupingBy(num -> num - Arrays.binarySearch(nums, num)))
	                .entrySet().stream()  //.forEach(x->System.out.println("= "+x));
	                .max((entry1, entry2) -> entry1.getValue().size() - entry2.getValue().size())
	                .orElseThrow()
	                .getValue();
	        // return null;
	    }
	 public static List<Integer> findLongestConsecutive1(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return Collections.emptyList();
	        }

	        Set<Integer> numSet = new HashSet<>();
	        for (int num : nums) {
	            numSet.add(num);
	        }

	        int longestStreak = 0;
	        List<Integer> longestSequence = new ArrayList<>();

	        for (int num : numSet) {
	            if (!numSet.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }

	                if (currentStreak > longestStreak) {
	                    longestStreak = currentStreak;
	                    longestSequence.clear();
	                    for (int i = 0; i < currentStreak; i++) {
	                        longestSequence.add(num + i);
	                    }
	                }
	            }
	        }

	        return longestSequence;
	    }
}
