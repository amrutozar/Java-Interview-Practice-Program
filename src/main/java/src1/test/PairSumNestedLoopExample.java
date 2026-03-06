package src1.test;

import java.util.Arrays;
import java.util.List;
/* Suppose you have a list of integers and you want to find all pairs of numbers whose sum is equal to a given target value. */
public class PairSumNestedLoopExample {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int targetSum = 10;

        System.out.println("Pairs with the sum of " + targetSum + ":");
        findPairsWithSum(numbers, targetSum);
    }

    public static void findPairsWithSum(List<Integer> numbers, int targetSum) {
        numbers.stream().forEach(num1 ->
                numbers.stream()
                        .filter(num2 -> num1 != num2 && num1 + num2 == targetSum)
                        .forEach(num2 -> System.out.println(num1 + " + " + num2 + " = " + targetSum))
        );
    }
}
/* outPut
 Pairs with the sum of 10:
1 + 9 = 10
2 + 8 = 10
3 + 7 = 10
4 + 6 = 10
6 + 4 = 10
7 + 3 = 10
8 + 2 = 10
9 + 1 = 10

*/
