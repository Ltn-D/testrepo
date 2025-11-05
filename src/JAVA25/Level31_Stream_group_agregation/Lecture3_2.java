package JAVA25.Level31_Stream_group_agregation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lecture3_2 {
    public static void main(String[] args) {
        // Исходный список экзотических фруктов
        List<String> fruits = Arrays.asList(
                "Apple", "Banana", "Avocado", "Cherry", "Apricot", "Blueberry"
        );
        Map<Boolean, List<String>> sortedFruits = fruits.stream()
                .collect(Collectors.partitioningBy(fruit -> fruit.startsWith("A")));

        // Разделяем фрукты на две корзины с помощью Stream API и partitioningBy:
        // ключ true — название начинается с 'A', ключ false — все остальные


        // Выводим содержимое обеих корзин
        System.out.println("Корзина с фруктами на 'A': " + sortedFruits.get(true));
        System.out.println("Корзина с остальными фруктами: " + sortedFruits.get(false));
    }
}
