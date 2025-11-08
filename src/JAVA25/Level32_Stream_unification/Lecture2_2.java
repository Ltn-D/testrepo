package JAVA25.Level32_Stream_unification;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture2_2 {
    public static void main(String[] args) {
        // Создаем неизменяемый список с названиями планет
        List<String> celestialBodies = List.of("Луна", "Марс", "Венера");

        String joined = celestialBodies.stream()
                .collect(Collectors.joining(" | "));


        System.out.println("Планеты: " + joined);
    }
}
