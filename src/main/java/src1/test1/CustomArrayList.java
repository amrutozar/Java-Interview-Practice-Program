package src1.test1;

import java.util.Arrays;

public class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object[] elements;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Adds a new element to the end of the list
    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // Returns the element at the specified index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndexRange(index);
        return (T) elements[index];
    }

    // Replaces the element at the specified index with a new value
    public void set(int index, T element) {
        checkIndexRange(index);
        elements[index] = element;
    }

    // Removes the element at the specified index
    public T remove(int index) {
        checkIndexRange(index);
        T oldElement = get(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // clear to let GC do its work
        return oldElement;
    }

    // Returns the current size of the list
    public int size() {
        return size;
    }

    // Ensures there's enough capacity, doubles the size of the array if needed
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // Checks if the index is within the bounds of the list
    private void checkIndexRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}

