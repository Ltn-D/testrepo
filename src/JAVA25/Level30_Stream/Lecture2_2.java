package JAVA25.Level30_Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture2_2 {
    public static void main(String[] args) {
        // Исходные показания датчиков
        List<Integer> readings = List.of(3, 7, 2, 9, 4, 6, 8, 5);

        // Обрабатываем показания через Stream API:
        List<String> oddLabels = readings.stream()
                // 1) фильтруем нечётные,
                .filter(i -> i % 2 != 0)
                .sorted((i,i1)->Integer.compare(i1,i))
                // 2) превращаем в строки вида "Odd: X",
                .map(i -> "Odd: " + i)
                // 3) собираем в новый список
                .collect(Collectors.toList());


        // Выводим получившийся список на экран
        System.out.println(oddLabels);
    }
}
