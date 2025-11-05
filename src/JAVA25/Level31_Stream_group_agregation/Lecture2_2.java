package JAVA25.Level31_Stream_group_agregation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lecture2_2 {
    public static void main(String[] args) {
        // Исходный список "магических слов" в нужном порядке
        List<String> magicWords = List.of("Java", "Stream", "API");

        // Используем Stream API и метод collect с Collectors.joining(" "),
        // чтобы объединить слова одной строкой через пробел
        String spell = magicWords.stream()
                .collect(Collectors.joining(" "));


        // Произносим заклинание вслух — выводим результат на экран
        System.out.println(spell);
    }

}
