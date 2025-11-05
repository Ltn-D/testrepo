package JAVA25.Level30_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Lecture1_1 {
    public static void main(String[] args) {
        // Создаём последовательность уровней как массив целых чисел
        int[] levels = {1, 2, 3, 4, 5};

        // Преобразуем массив в поток и обрабатываем каждый элемент отдельно с помощью forEach
        Arrays.stream(levels)
                .forEach(System.out::println);

    }
}

