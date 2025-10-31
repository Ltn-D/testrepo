package JAVA25.Level27_interfaces_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lecture2_1 {
    static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("dog", "собака");
        dict.put("cat", "кошка");
        dict.put("bird", "птица");
        for (var word : dict.entrySet()) {
            System.out.println(word.getKey() + " = " + word.getValue());
        }
        dict.forEach((w1, w2) -> System.out.println(w1 + " = " + w2));
        Iterator<Map.Entry<String,String>> iterator=dict.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() +" = "+ entry.getValue());
        }
    }
}
