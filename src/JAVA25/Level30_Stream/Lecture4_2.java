package JAVA25.Level30_Stream;

import java.util.Arrays;
import java.util.List;

public class Lecture4_2 {
    public static void main(String[] args) {
        // Исходные показания с датчиков
        List<Integer> readings = Arrays.asList(10, 15, 20, 25, 30);

        // Строим конвейер обработки:
        List<String> report=readings.stream()
                .filter(item -> item%10 ==0)
        // 1) фильтруем только кратные 10
                .peek(item-> System.out.println("отфильтровано: " + item))
        // 2) с помощью peek выводим значения, прошедшие фильтр (до преобразования в строку)
                .map(item-> item.toString())
                // 3) преобразуем числа в строки
        // 4) собираем в отдельный список
                .toList();

        // Выводим итоговый список строк на экран
        System.out.println(report);
    }
}
