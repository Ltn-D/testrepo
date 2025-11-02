package JAVA25.Level28_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lecture3_2 {
    static void main() {
        HashMap<String, Integer> results = new HashMap<>();
        results.put("A", 1);
        results.put("B", 2);
        results.put("C", 3);
        results.put("D", 4);
        //results.entrySet().removeIf(result -> result.getValue() % 2 == 0);//удаление элементов с четными значениями через entrySet().removeIf
        Iterator<Map.Entry<String, Integer>> iterator = results.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(results);
    }
}
