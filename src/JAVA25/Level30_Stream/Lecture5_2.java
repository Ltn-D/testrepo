package JAVA25.Level30_Stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lecture5_2 {
    public static void main(String[] args) {
        // Импортированный список: есть дубликаты по имени с разными возрастами
        List<User> imported = List.of(
                new User("Иван", 23),
                new User("Анна", 19),
                new User("Иван", 28),   // дубликат имени — должен быть проигнорирован
                new User("Павел", 30),
                new User("Анна", 22),   // дубликат имени — должен быть проигнорирован
                new User("Ева", 20)
        );

        // Формируем "чистую" базу профилей по имени.
        Map<String, User> uniqueUsers = imported.stream()
                // Collectors.toMap:
                .collect(Collectors.toMap(
                        user-> user.getName(),
                        user-> user,
                                (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new

                ));
        // - ключ: имя пользователя
        // - значение: сам объект User
        // - при коллизии (дубликате имени) оставляем первый (first), игнорируем следующий (ignored)
        // - LinkedHashMap::new — сохраняем порядок первых появлений


        // Итоговая коллекция уникальных профилей
        List<User> uniqueProfiles = new ArrayList<>();
        for (Map.Entry user : uniqueUsers.entrySet()) {
            uniqueProfiles.add((User) user.getValue());
        }
        List<User> uniqueProfiles1 = new ArrayList<>(uniqueUsers.values());// так проще и тоже работает
        // Выводим итоговую структуру данных
        uniqueProfiles.forEach(System.out::println);
        uniqueProfiles1.forEach(System.out::println);
        //System.out.println(uniqueProfiles);
    }

    // Простой класс профиля пользователя
    static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            // Наглядное представление профиля: "Имя — возраст лет"
            return name + " — " + age + " лет";
        }
    }
}


