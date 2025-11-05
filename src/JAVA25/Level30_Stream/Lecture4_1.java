package JAVA25.Level30_Stream;

import java.util.List;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Список всех учеников (пример данных)
        List<String> students = List.of(
                "Анна", "Борис", "Алексей", "Мария",
                "Андрей", "Виктор", "Артур", "Галина", "Алиса", "Дмитрий"
        );
        students.stream()
                .filter(name-> name.startsWith("А"))
                .forEach(System.out::println);

        // Проходим по потоку имён, оставляем только те, что начинаются на 'А',
        // и сразу выводим каждое имя на экран.
        // Важно: не собираем отфильтрованные имена в новую коллекцию.

    }
}
