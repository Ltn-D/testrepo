package JAVA25.Level27_interfaces_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lecture2_2 {
    static void main(String[] args) {
        Set<String> technologies = new HashSet<>(Arrays.asList("java", "python", "c++", "javascript"));
        Iterator<String> iterator = technologies.iterator();
        while (iterator.hasNext()) {
           String technology = iterator.next();
            if (technology.contains("+")) {
                iterator.remove();
            }
        }
        for (String s : technologies) {
            System.out.println(s);
        }
    }

}
