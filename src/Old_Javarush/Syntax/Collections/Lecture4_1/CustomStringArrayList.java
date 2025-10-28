package Old_Javarush.Syntax.Collections.Lecture4_1;

import java.util.Arrays;

public class CustomStringArrayList {
    private int size;
    private int capacity;
    String[] elements;

    public CustomStringArrayList() {
        size = 0;
        capacity = 10;
        elements = new String[capacity];
    }

    public void add(String string) {
        if (size == capacity) {
            grow();
        } else {
            elements[size] = string;
        }
        size ++;


    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        elements = Arrays.copyOf(elements, capacity);
    }
}
