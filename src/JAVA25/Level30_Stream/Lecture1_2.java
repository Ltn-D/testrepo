package JAVA25.Level30_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lecture1_2 {
    public static void main(String[] args) {
        // Исходный список категорий в нижнем регистре
        List<String> categories = Arrays.asList("java", "stream", "api");
        List<String> uppercased = categories.stream()
                .map(String::toUpperCase)
                .toList();
        // Преобразуем каждый элемент в верхний регистр с помощью Stream API
        // и собираем результат в НОВЫЙ список (исходный список остаётся без изменений).
        System.out.println(uppercased);
        // Выводим новый список на экран
    }
}
