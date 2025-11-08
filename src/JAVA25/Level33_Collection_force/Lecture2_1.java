package JAVA25.Level33_Collection_force;

import java.util.List;
import java.util.stream.Stream;

public class Lecture2_1 {
    public static void main(String[] args) {
        // Создаем список чисел от 1 до 5
        List<Integer> foods = List.of(1, 2, 3, 4, 5);

        foods.stream()
                .filter(i-> {
                    System.out.println("Кот размышляет о еде" + i);
                    return i >2;
                })
                .map(i->{
                    System.out.println("Кот представляет вкус" + i);
                    return  i*2;
                });

        // Строим ленивую Stream-цепочку: filter -> map.
        // Внутри лямбд есть println, но они НЕ выполнятся без терминальной операции.

    }
}
