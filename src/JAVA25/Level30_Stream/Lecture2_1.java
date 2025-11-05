package JAVA25.Level30_Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture2_1 {
    public static void main(String[] args) {
        // Исходный список названий предметов
        List<String> items = List.of("apple", "banana", "apricot", "cherry", "avocado");

        // Обрабатываем список с помощью Stream API:
        List<Integer> lengths = items.stream()
                // 1) filter — оставляем строки, которые начинаются на 'a'
                .filter(item -> item != null && item.toLowerCase().startsWith("a"))
                // 2) map — заменяем строку на её длину
                .map(String::length)
                // 3) collect — собираем длины в новый список
                .toList();
        // Выводим получившийся список длин
        System.out.println(lengths);
    }
}
