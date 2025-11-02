package JAVA25.Level28_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lecture1_1 {
    static void main(String[] args) {
        List<Integer> levels = new ArrayList<>(List.of(5, -3, 8, -1, 0, 4, -7));
        Iterator<Integer> iter = levels.iterator();
        while (iter.hasNext()) {
            if (iter.next() < 0) {
                iter.remove();
            }
        }
        System.out.println(levels);
    }

}
