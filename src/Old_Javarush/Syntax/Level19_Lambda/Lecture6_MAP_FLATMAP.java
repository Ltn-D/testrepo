package Old_Javarush.Syntax.Level19_Lambda;

import java.util.*;
import java.util.stream.Stream;


public class Lecture6_MAP_FLATMAP {

    static class Person {
        private String name;
        private List<String> favoriteColors;

        public Person(String name, List<String> favoriteColors) {
            this.name = name;
            this.favoriteColors = favoriteColors;
        }

        public List<String> getFavoriteColors() {
            return favoriteColors;
        }
    }
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList("Red", "Blue")),
                new Person("Bob", Arrays.asList("Green", "Yellow")),
                new Person("Charlie", Arrays.asList("Purple"))
        );
        Stream  <Person> person = people.stream();
        Stream<List<String>> favoriteColors = person.map(person1 -> person1.getFavoriteColors());
        favoriteColors.forEach(System.out::println);
        Stream<String> allFavoriteColors = person.flatMap(person1 -> person1.getFavoriteColors().stream());

    }
}

