package JAVA25.Level30_Stream;

import java.util.List;

public class Lecture5_1 {
    public static void main(String[] args) {
        // Исходный список зарегистрированных участников с дубликатами
        List<String> registered = List.of("Анна", "Сергей", "Анна", "Мария", "Иван", "Сергей");

        // Используем Stream API для удаления дубликатов:
        // distinct() оставляет только уникальные элементы в порядке первого появления
        List<String>uniqueParticipants = registered.stream()
                .distinct()
                .toList();


        // Выводим окончательный список уникальных участников
        uniqueParticipants.forEach(System.out::println);
    }
}
