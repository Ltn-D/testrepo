package JAVA25.Level32_Stream_unification;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lecture1_2 {
    public static void main(String[] args) {
        // Исходные данные: ID студента -> список его хобби (неизменяемые коллекции)
        Map<Integer, List<String>> studentHobbyMap = Map.of(
                1, List.of("Плавание", "Шахматы"),
                2, List.of("Футбол"),
                3, List.of("Программирование", "Чтение", "Кино")
        );
        List<String> hobbies = studentHobbyMap.values().stream()
                .flatMap(hobby ->hobby.stream())
                .toList();
        List<String> individualHobbyEntries = studentHobbyMap.entrySet().stream()
                .flatMap(entry-> entry.getValue().stream()
                        .map(hobby -> entry.getKey() + ": "+ hobby))
                        .collect(Collectors.toList());

        // Превращаем карту в поток её записей и "разворачиваем" каждую запись
        // в несколько строк формата "ID: Хобби" через mapMulti
        List<Object> individualHobbyEntries1 = studentHobbyMap.entrySet().stream()
                .mapMulti((entry, consumer) -> {
                    for (String hobby : entry.getValue()) {
                        consumer.accept(entry.getKey() + ": " + hobby);
                    }
                })
                .toList();


        // Вывод результата
        System.out.println(individualHobbyEntries);
        System.out.println(individualHobbyEntries1);
        System.out.println(hobbies);
    }

}
