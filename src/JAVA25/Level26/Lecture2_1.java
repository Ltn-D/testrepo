package JAVA25.Level26;

import java.util.ArrayList;
import java.util.List;

public class Lecture2_1 {
    static void main(String[] args) {
        List<String> lesson = new ArrayList<>();
        lesson.add("Математика");
        lesson.add("Физика");
        lesson.add("Информатика");
        lesson.add(0,"Английский");
        lesson.remove("Физика");
        lesson.forEach(System.out::println);
    }


}
