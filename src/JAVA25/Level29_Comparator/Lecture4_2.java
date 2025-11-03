package JAVA25.Level29_Comparator;

import java.util.ArrayList;
import java.util.List;

public class Lecture4_2 {
    static class Person {
        private final String personName;

        public Person(String personName) {
            this.personName = personName;
        }

        public String getPersonName() {
            return personName;
        }
    }
    public static void main(String[] args) {
        // Создаем динамический список участников
        List<Person> participants = new ArrayList<>();

        // Заполняем список объектами Person с именами разной длины
        participants.add(new Person("Ева"));
        participants.add(new Person("Анна"));
        participants.add(new Person("Александр"));
        participants.add(new Person("Илья"));
        participants.add(new Person("Максим"));

        participants.sort((p1, p2) -> Integer.compare(p1.getPersonName().length(), p2.getPersonName().length()));
        // Сортируем по возрастанию длины personName с помощью лямбда-выражения (Comparator)


        // Выводим только имена участников, по одному на строке
        for (Person p : participants) {
            System.out.println(p.getPersonName());
        }
    }
}



