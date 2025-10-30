package JAVA25.Level26;

import java.util.TreeMap;

public class Lecture3_2 {
    static void main(String[] args) {
        TreeMap<String, Integer> fruits = new TreeMap<>();
        fruits.put("pear", 6);
        fruits.put("apple", 2);
        fruits.put("banana", 4);
        for (var fruit : fruits.entrySet()) {
            System.out.printf("Фрукт: %s, Количество: %d\n",fruit.getKey(),fruit.getValue());
        }
        System.out.println("___________________");
        fruits.forEach((fruit, value) ->System.out.printf("Фрукт: %s, Количество: %d\n",fruit,value));
    }
}
