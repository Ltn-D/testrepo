package JAVA25.Level32_Stream_unification;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture4_2 {
    public static void main(String[] args) {
        // Подготовленный список имён
        List<String> potentialNames = Arrays.asList("Ира", "Олег", "Максим", "Таня", "Сергей");

        Random random = new Random();

        List<String> demoUserProfiles = Stream.generate(
                ()-> potentialNames.get(random.nextInt(potentialNames.size())) + "-" + (18 + random.nextInt(5)))
                .distinct()
                .limit(5)
                .toList();

                // Генерируем бесконечный поток профилей с помощью Stream.generate
        // В каждой генерации случайно выбираем имя из списка и возраст от 18 до 22


        // Выводим список профилей на экран
        System.out.println(demoUserProfiles);
    }
}
