package JAVA25.Level21_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lecture5_2 {
    static class City implements Comparable<City> {
        private String name;
        private int population;

        public City(String name, int population) {
            this.name = name;
            this.population = population;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.population, o.population);
        }

        @Override
        public String toString() {
            return String.format("Город %s, население: %d",name,population);
        }
    }

    static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Нью-Йорк", 8400000)); // 8.4 млн
        cities.add(new City("Лондон", 8900000));   // 8.9 млн
        cities.add(new City("Париж", 2100000));    // 2.1 млн
        cities.sort(City::compareTo);
        cities.forEach(System.out::println);

    }
}
