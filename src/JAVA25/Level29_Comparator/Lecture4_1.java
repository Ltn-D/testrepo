package JAVA25.Level29_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lecture4_1 {
    public static void main(String[] args) {
        // Создаем динамический список для хранения участников
        List<Person> attendees = new ArrayList<>();

        // Заполняем список объектами Person с разными возрастами
        attendees.add(new Person("Иван", 21));
        attendees.add(new Person("Анна", 19));
        attendees.add(new Person("Сергей", 30));
        attendees.add(new Person("Мария", 25));
        attendees.add(new Person("Дмитрий", 22));

        attendees.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.personAge, o2.personAge);
            }
        });// Сортируем список по возрасту (по возрастанию) с помощью анонимного класса Comparator



        // Выводим результат: "Имя, возраст" на каждой строке
        for (Person p : attendees) {
            System.out.println(p.personName + ", " + p.personAge);
        }
        attendees.sort(Comparator.comparing(person -> person.personName));
        for (Person p : attendees) {
            System.out.println(p.personName + ", " + p.personAge);
        }
        attendees.sort((p1, p2) -> Integer.compare(p2.personAge, p1.personAge));
        for (Person p : attendees) {
            System.out.println(p.personName + ", " + p.personAge);
        }
    }
}

// Простой класс Person с требуемыми полями.
class Person {
    public final String personName;
    public final int personAge;

    public Person(String personName, int personAge) {
        this.personName = personName;
        this.personAge = personAge;
    }
}
