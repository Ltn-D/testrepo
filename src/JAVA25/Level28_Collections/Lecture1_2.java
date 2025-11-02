package JAVA25.Level28_Collections;

import java.util.ArrayList;
import java.util.List;

public class Lecture1_2 {
    static void main(String[] args) {
        List<String> testNames = new ArrayList<>(List.of("cat", "elephant", "dog", "tiger", "rat", "lion"));
        testNames.removeIf(names -> names.length() < 4);
        System.out.println(testNames);
    }
}
