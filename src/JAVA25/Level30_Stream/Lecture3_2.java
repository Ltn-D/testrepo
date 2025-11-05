package JAVA25.Level30_Stream;

import java.util.List;

public class Lecture3_2 {
    public static void main(String[] args) {
        // Исходные данные с повторами
        List<Integer> sales = List.of(5, 7, 5, 9, 7, 11, 13, 9, 15);

        // Stream-пайплайн:
        List<Integer> top4Unique = sales.stream()
                .distinct()
                .limit(4)
                .toList();
        // distinct() — удаляем дубликаты, сохраняя порядок первого появления
        // limit(4) — оставляем только первые четыре уникальных значения


        // Выводим получившийся список
        System.out.println(top4Unique); // [5, 7, 9, 11]
    }
}
