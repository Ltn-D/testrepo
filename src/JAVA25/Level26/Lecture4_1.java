package JAVA25.Level26;

import java.util.TreeSet;

public class Lecture4_1 {
    static void main(String[] args) {
        TreeSet<String> guests = new TreeSet<>();
        guests.add("Борис");
        guests.add("Алексей");
        guests.add("Виктор");
        guests.forEach(System.out::println);

    }


}
