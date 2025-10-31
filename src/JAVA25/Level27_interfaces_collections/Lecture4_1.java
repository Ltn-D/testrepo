package JAVA25.Level27_interfaces_collections;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Lecture4_1 {
    static void main(String[] args) {
        NavigableMap<Integer, String> levels = new TreeMap<>();
        levels.put(1, "бронзовый");
        levels.put(3, "серебряный");
        levels.put(5, "золотой");
        levels.put(7, "платиновый");
        Scanner scanner = new Scanner(System.in);
        int inputLevel = scanner.nextInt();
        Integer key = levels.floorKey(inputLevel);
        if (key == null) {
            System.out.println("Значение не может быть меньше 1");
        }
        try {
            System.out.println(levels.get(key));
        } catch (NullPointerException e) {
            System.out.println("Нет уровня");
        }
    }
}
