package JAVA25.Level31_Stream_group_agregation;

import java.util.*;

public class Lecture1_1 {
    public static void main(String[] args) {
        // Список цен проданных товаров за день
        List<Integer> prices = Arrays.asList(100, 250, 80, 40);

        // Считаем среднюю цену через примитивный стрим; если список пуст — 0.0

        double average = prices.stream()
                .mapToDouble(Double::valueOf)
                .average()
                .orElse(0.0);


        // Находим минимальную цену; если список пуст — -1
        int min = prices.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElse(-1);

        // Выводим результаты на экран (каждое значение с новой строки)
        System.out.println(average);
        System.out.println(min);
    }
}
