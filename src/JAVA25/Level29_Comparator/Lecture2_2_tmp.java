package JAVA25.Level29_Comparator;

import java.util.Comparator;
import java.util.Objects;

public class Lecture2_2_tmp {
    static class Person {
        private String personName;

        public Person(String personName) {
            this.personName = personName;
        }

        public String getPersonName() {
            return personName;
        }
    }
    public static void main(String[] args) {
        // Создаем двух участников
        Person anna = new Person("Анна");
        Person boris = new Person("Борис");

        // Создаем компаратор по имени
        Comparator<Person> comparator = Comparator.comparing(person -> person.getPersonName());

        // Сравниваем через Objects.compare, передавая компаратор
        int result = Objects.compare(anna, boris, comparator);

        // Выводим вердикт по результату сравнения
        if (result < 0) {
            System.out.println("Анна идет раньше Бориса");
        } else if (result > 0) {
            System.out.println("Борис идет раньше Анны");
        } else {
            System.out.println("Имена совпадают");
        }
    }

}
