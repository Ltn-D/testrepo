package JAVA25.Level32_Stream_unification;

import java.util.List;
import java.util.stream.Stream;

public class Lecture2_1 {
    public static void main(String[] args) {
        // Создаем два неизменяемых списка с фруктами из двух корзин
        List<String> firstBasketFruits = List.of("Яблоко", "Груша");
        List<String> secondBasketFruits = List.of("Банан", "Апельсин");

        Stream<String> allSaladIngredients = Stream.concat(firstBasketFruits.stream(), secondBasketFruits.stream());

        allSaladIngredients.forEach(System.out::println);
    }
}
