package JAVA25.Level31_Stream_group_agregation;

import java.util.List;
import java.util.Optional;

public class Lecture2_1 {
    public static void main(String[] args) {
        // Исходный список температур за неделю
        List<Integer> temperatures = List.of(7, 3, 15, 2, 9);

        // Ищем максимум через Stream API и reduce.
        Optional<Integer> max = temperatures.stream().
                reduce(Integer::max);
        max.ifPresent(System.out::println);

        // Используем вариант без identity, чтобы при пустом списке получить Optional.empty,
        // а не бросать исключение.


        // Выводим результат только если данные есть

    }

}
