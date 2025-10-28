package JAVA25.Level22Record_class;

import java.util.HashMap;
import java.util.Map;

public class Lecture1_4 {
    static void main(String[] args) {
        Map<User, String> roles = new HashMap<>();
        roles.put(new User("Алиса", 1L), "администратор");
        roles.put(new User("Боб", 2L), "модератор");
        roles.put(new User("Ева", 3L), "гость");

        User lookup = new User("Боб", 2L);
        String role = roles.get(lookup);
        System.out.println(role);

    }

    static record User(String name, long id) {}
}
