package JAVA25.Level27_interfaces_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture5_2 {
    public static void addStrings(List<? super String> list,List<String> values) {
        list.addAll(values);
    }
    public static void main(String[] args) {
        // Универсальный журнал событий: может хранить любые объекты
        ArrayList<Object> eventLog = new ArrayList<>();

        // Тестовые строковые сообщения
        List<String> messages = Arrays.asList(
                "Система запущена",
                "Ошибка базы данных",
                "Операция завершена"
        );

        // Добавляем строки в универсальный журнал через метод с wildcard ? super String
        addStrings(eventLog, messages);

        // Проверяем результат: выводим содержимое журнала
        System.out.println(eventLog);
    }
}
