package JAVA25.Level33_Collection_force;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Lecture2_2 {
    public static void main(String[] args) {
        // Список номеров сокровищ
        List<Integer> treasures = List.of(10, 15, 20, 25, 30);

        // Ленивая обработка:
        // peek печатает только для реально обработанных элементов,
        // findFirst останавливает обработку, как только найден первый подходящий элемент
        int artifact = treasures.stream()
                .peek(x -> System.out.println("Проверяю: " + x))
                .filter(x -> x % 20 == 0)
                .findFirst()
                .orElseThrow();



        // Выводим номер найденного артефакта
        System.out.println(artifact);
    }
}
