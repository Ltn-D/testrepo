package JAVA25.Level33_Collection_force;

import java.util.List;
import java.util.Spliterator;

public class Lecture4_2 {
    public static void main(String[] args) {
        // 1) Создаем список из шести различных задач
        List<String> projectTasks = List.of(
                "Дизайн",
                "Разработка",
                "Тестирование",
                "Документация",
                "Деплой",
                "Мониторинг"
        );

        // 2) Получаем Spliterator для всего списка
        Spliterator<String> alphaTasks = projectTasks.spliterator();

        // 3) Делим исходный сплитератор на две части.
        Spliterator<String> bettaTasks = alphaTasks.trySplit();
        // trySplit() возвращает новую часть (примерно половину),
        // а в alphaTasks остаются оставшиеся элементы.


        // 4) Выводим задачи, которые достались каждой команде.
        // По нашему распределению:
        // - Команда Альфа получает те элементы, которые остались в исходном spliterator (alphaTasks)
        // - Команда Бета получает те элементы, которые вернул trySplit() (betaTasks)

        System.out.println("Команда Альфа:");
        alphaTasks.forEachRemaining(System.out::println);

        System.out.println();
        System.out.println("Команда Бета:");
        if (bettaTasks != null) {
            bettaTasks.forEachRemaining(System.out::println);
        }
    }
}
