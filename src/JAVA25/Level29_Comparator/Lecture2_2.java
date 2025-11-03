package JAVA25.Level29_Comparator;

import java.util.Comparator;
import java.util.Objects;

public class Lecture2_2 {
    static class Person {
        private String personName;

        public Person(String personName) {
            this.personName = personName;
        }

        public String getPersonName() {
            return personName;
        }
    }

    static class PersonByNameComparator implements Comparator<Person> {
                @Override
        public int compare(Person o1, Person o2) {
            return o1.getPersonName().compareTo(o2.getPersonName());
        }
    }

    public static void main(String[] args) {
        // Создаем двух участников
        Person anna = new Person("Анна");
        Person boris = new Person("Борис");

        // Создаем компаратор по имени
        PersonByNameComparator comparator = new PersonByNameComparator();

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
