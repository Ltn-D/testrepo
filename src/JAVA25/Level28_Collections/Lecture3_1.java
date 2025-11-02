package JAVA25.Level28_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lecture3_1 {
    static void main(String[] args) {
        List<String> animals = new ArrayList<>(List.of("cat", "dog", "bird", "fish"));
        ListIterator<String> iterator = animals.listIterator();
        while (iterator.hasNext()) {
            //String animal = iterator.next();
            if (iterator.next().length() == 3) {
                iterator.set("pet");
            }
        }
        System.out.println(animals);
    }
}
