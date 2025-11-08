package JAVA25.Level32_Stream_unification;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture3_1 {
    public static void main(String[] args) {
        // Два исходных множества подозреваемых из разных источников
        Set<String> suspectsFromSourceA = Set.of("Анна", "Борис", "Виктор", "Дмитрий", "Елена");
        Set<String> suspectsFromSourceB = Set.of("Виктор", "Елена", "Жанна", "Игорь", "Павел");
        Set<String> uniqueLeads = Stream.concat(
                suspectsFromSourceA.stream().filter(name-> !suspectsFromSourceB.contains(name)),
                        suspectsFromSourceB.stream().filter(name-> !suspectsFromSourceA.contains(name)))
                .collect(Collectors.toSet());
        // Симметрическая разность множеств через Stream API:
        // (A \ B) ∪ (B \ A) — т.е. оставляем только тех, кто встречается ровно в одном из наборов
        // Вывод результата
        System.out.println(uniqueLeads);
    }
}
