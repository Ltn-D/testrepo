package JAVA25.Level32_Stream_unification;

import java.util.*;
import java.util.stream.*;

public class Lecture4_tmp {
    static class Person {
        String name;
        int age;
        Person(String name, int age) { this.name = name; this.age = age; }
        public String toString() { return name + " (" + age + ")"; }
    }

    static void main(String[] args) {
        List<String> names = Arrays.asList("Аня", "Борис", "Вика");
        List<Integer> ages = Arrays.asList(20, 25, 19);
        int size = Math.min(names.size(), ages.size());
        List<Person> people = IntStream.range(0, size)//поток целых чисел от 0 до длины самого короткого листа
                .mapToObj(i-> new Person(names.get(i), ages.get(i))) // каждое число из потока берем в качестве индекса нового списка и для него создаем новый экземпляр Person
                .collect(Collectors.toList());
        people.forEach(System.out::println);
    }
}
