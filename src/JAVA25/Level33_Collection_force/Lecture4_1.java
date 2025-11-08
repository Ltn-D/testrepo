package JAVA25.Level33_Collection_force;

import java.util.List;
import java.util.Spliterator;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Список номеров посылок от 1 до 5
        List<Integer> documentStack = List.of(1, 2, 3, 4, 5);

        // Получаем Spliterator у списка
        Spliterator <Integer> spliterator = documentStack.spliterator();



        // Обрабатываем только первый элемент: tryAdvance вызываем ровно один раз
        // Consumer печатает значение на экран
        spliterator.tryAdvance(System.out::println);
    }
}
