package JAVA25.Level33_Collection_force;

import java.util.List;

public class Lecture1_2 {
    public static void main(String[] args) {
        // Исходный список названий заклинаний
        List<String> ancientSpells = List.of("Java", "Stream", "API", "IntStream");

        // Преобразуем Stream<String> в IntStream с помощью mapToInt,
        // чтобы получить примитивные int (без автоупаковки в Integer),
        // и печатаем каждую длину на новой строке.
        ancientSpells.stream()
                .mapToInt(s -> s.length())
                .forEach(System.out::println);

    }
}
