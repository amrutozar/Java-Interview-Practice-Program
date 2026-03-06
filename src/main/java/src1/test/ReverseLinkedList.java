package src1.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");
        linkedList.add("JavaScript");

        // Printing the original LinkedList
        System.out.println("Original LinkedList: " + linkedList);

        // Printing the LinkedList in reverse order
        System.out.println("Reversed LinkedList:");
        printReverseLinkedList(linkedList);
    }

    private static void printReverseLinkedList(LinkedList<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

