package JAVA25.Level32_Stream_unification;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Создаем "свиток" — поток строк из трех заклинаний
        Stream<String> spells = Stream.of("one", "two", "three");

        List<String> strings = spells.toList();
        //long cou   = spells.count();

        // Первая терминальная операция: переписываем заклинания в список (магическую книгу)


        // Вторая терминальная операция над тем же потоком — запрещена:
        // Потоки в Java одноразовые. Повторное чтение приведет к IllegalStateException.

    }
}
