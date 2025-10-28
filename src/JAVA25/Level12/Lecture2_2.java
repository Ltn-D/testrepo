package JAVA25.Level12;

import java.util.HashMap;

public class Lecture2_2 {
    static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Анна", 5);
        if (studentGrades.containsKey("Анна")) {
            System.out.println("" + studentGrades.get("Анна"));
        }

    }
}
