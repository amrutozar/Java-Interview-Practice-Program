package src1.test;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);

        System.out.println("Original ArrayList: " + numbers);

        removeDuplicates(numbers);

        System.out.println("ArrayList after removing duplicates: " + numbers);
    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int currentElement = list.get(i);
            for (int j = i + 1; j < size; j++) {
                if (list.get(j) == currentElement) {
                    list.remove(j);
                    size--;
                    j--; // Decrement j to recheck the current index after removing the element
                }
            }
        }
    }
}
