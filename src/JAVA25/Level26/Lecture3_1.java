package JAVA25.Level26;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Lecture3_1 {
    static void main(String[] args) {
        Map<String, Integer> weeksDay = new TreeMap<>();
        weeksDay.put("Monday", 1);
        weeksDay.put("Tuesday", 2);
        weeksDay.put("Wednesday", 3);
        weeksDay.put("Thursday", 4);
        weeksDay.put("Friday", 5);
        weeksDay.put("Saturday", 6);
        weeksDay.put("Sunday", 7);

        for (Map.Entry<String, Integer> element : weeksDay.entrySet()) {
            String key = "День: " + element.getKey();
            String value = "Номер: " + element.getValue();
            System.out.println(key + ", " + value);

        }
    }
}
