package Old_Javarush.Syntax.Collections2;

import java.util.HashMap;

public class Lecture4_1 {
    public static HashMap<String, Double> grades = new HashMap<>();

    static void main(String[] args) {
        addStudents();
        System.out.println(grades);

    }
    public static void addStudents() {
        grades.put("Даша", 4.6);
        grades.put("Артем", 4.3);
        grades.put("Маша", 3.6);
        grades.put("Петя", 2.9);
        grades.put("Вася", 4.8);
    }

}
