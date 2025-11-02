package JAVA25.Level29_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture3_TMP {
    static class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Геттеры (для примеров далее)
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person o) {
            return this.getName().compareTo(o.getName());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Вася", 25));
        people.add(new Person("Петя", 20));
        people.add(new Person("Катя", 30));

        Collections.sort(people);
        people.forEach(System.out::println);
    }
}
